package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.entity.User;
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

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public  ModelAndView Login(User user){
        ModelAndView mav = new ModelAndView("login");
        mav.addObject(user);
        return mav;
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String LoginT(User user, Errors errors){
        if(errors.hasErrors()){
            return "login";
        }
        User u = userService.userLogin(user.getUsername(),user.getPassword());
        if(u==null)
            return "login";
        return "redirect:/user/home/"+u.getUsername();
    }

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public ModelAndView Register(User user){
        ModelAndView mav = new ModelAndView("register");
        mav.addObject(user);
        return mav;
    }
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String RegisterT(User user,Errors errors,HttpSession session){
        if (errors.hasErrors())
            return "register";
        if(userService.userRegister(user)){
            session.setAttribute("user",user);
            return "redirect:/user/home/"+user.getUsername();
        }
        else return "register";
    }


    @RequestMapping(value = "home/{username}",method = RequestMethod.GET)
    public ModelAndView userHome(@PathVariable String username){
        ModelAndView mav = new ModelAndView("userHome");
        User user = userService.getUserByUsername(username);
        if(user==null)
            mav = new ModelAndView("noSuchPage");   //找不到页面
        mav.addObject("user",user);


        return mav;
    }

}
