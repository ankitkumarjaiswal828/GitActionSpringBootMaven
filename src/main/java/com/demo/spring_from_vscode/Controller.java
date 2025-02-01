package com.demo.spring_from_vscode;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
 
    @RequestMapping("/show")
    @ResponseBody
    public String Show() {

        return "Hello spring project in VScode";
    }

    @RequestMapping("/dis")
    @ResponseBody
    public String display() {

        return "Hello spring ";
    }
}
