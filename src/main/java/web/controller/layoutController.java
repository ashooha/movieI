package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class layoutController {
    @RequestMapping("north")
    public String north(){
        return "layout/north";
    }
}
