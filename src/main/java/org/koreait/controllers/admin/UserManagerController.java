package org.koreait.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/user")
public class UserManagerController {
    @GetMapping
    public String userManger(){
        return "admin/user_manager";
    }
}
