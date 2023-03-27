package org.koreait.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/board")
public class BoardManagerController {
    @GetMapping
    public String boardManager(){
        return "admin/board_manager";
    }
}
