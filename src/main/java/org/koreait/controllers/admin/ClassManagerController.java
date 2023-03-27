package org.koreait.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/class")
public class ClassManagerController {

    @GetMapping
    public String classManager(){
        return "admin/class_manager";
    }
}
