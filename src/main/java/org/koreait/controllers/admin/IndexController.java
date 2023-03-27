package org.koreait.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/admin/")
public class IndexController {
    @GetMapping
    public String index(Model model){
        List<String> addCss = Arrays.asList("test01","test02");
        List<String> addScript = Arrays.asList("test01","test02");

        model.addAttribute("addCss",addCss);
        model.addAttribute("addScript",addScript);
        return "admin/index";
    }
}
