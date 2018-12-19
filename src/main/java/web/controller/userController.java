package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import web.entity.tUser;
import web.pageModle.Json;
import web.pageModle.SessionInfo;
import web.pageModle.User;
import web.service.userService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class userController {

    @Autowired
    private userService userService;


    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Json login(User user,HttpSession session){
        Json json = new Json();
        User u = userService.userLogin(user);
        if(u!=null){
            json.setSuccess(true);
            json.setMsg("登录成功!");
            SessionInfo sessionInfo = new SessionInfo();
            sessionInfo.setId(u.getId());
            sessionInfo.setName(u.getUsername());
            session.setAttribute("sessionInfo",sessionInfo);

            json.setObj(sessionInfo);
        }
        else {
            json.setMsg("账号或密码错误！");
        }
        return json;
    }

    @ResponseBody
    @RequestMapping(value = "/logout" )
    public Json logout(HttpSession session){
        Json json = new Json();
        if(session!=null)
            session.invalidate();
        json.setSuccess(true);
        json.setMsg("注销成功！");
        return json;
    }

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public ModelAndView Register(tUser tUser){
        ModelAndView mav = new ModelAndView("register");
        mav.addObject(tUser);
        return mav;
    }
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String RegisterT(tUser tUser, Errors errors, HttpSession session){
        if (errors.hasErrors())
            return "register";
        if(userService.userRegister(tUser)){
            session.setAttribute("user", tUser);
            return "redirect:/tUser/home/"+ tUser.getUsername();
        }
        else return "register";
    }


    @RequestMapping(value = "home/{username}",method = RequestMethod.GET)
    public ModelAndView userHome(@PathVariable String username){
        ModelAndView mav = new ModelAndView("userHome");
        tUser tUser = userService.getUserByUsername(username);
        if(tUser ==null)
            mav = new ModelAndView("noSuchPage");   //找不到页面
        mav.addObject("user", tUser);


        return mav;
    }

}
