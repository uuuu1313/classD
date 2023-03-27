package org.koreait.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonController {
    /**
     * 공통 에러 발생 시 이동할 페이지 매핑
     */
    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e, Model model){
        e.printStackTrace();
        model.addAttribute("errorMessage",e.getMessage());
        return "errors/error";
    }
}
