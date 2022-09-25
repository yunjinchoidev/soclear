package com.server.soclear.page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/go.do")
    public String go(){
        return "go";
    }
}
