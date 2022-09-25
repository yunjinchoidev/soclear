package com.server.soclear.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/main")
    public String main(){
        return "main";
    }

     @GetMapping("/index.do")
    public String index(){
        return "/index";
    }


}
