package com.example.cloud4cicd3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hi-cicd")

    public String  hi(){

        return  "hi  cicd docker !!!  ^^^ !!! 1215 ";
    }

    @ResponseBody
    @GetMapping("/hi2")
    public String  hi2(){

        return  "hi2 0630 ";
    }

    @ResponseBody
    @GetMapping("/hi3")
    public String  hi3(){

        return  "hi3 0630 ";
    }

}
