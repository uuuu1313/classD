package org.koreait.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HiController {
    @GetMapping
    public void hi(){
        throw new RuntimeException("예외 발생이다");
    }
}
