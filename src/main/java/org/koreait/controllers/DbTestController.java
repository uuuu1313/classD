package org.koreait.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DbTestController {

    private JdbcTemplate jdbcTemplate;

    @GetMapping("/members/test")
    public List<String> members(){
        String sql ="SELECT userNm FROM member";
        return jdbcTemplate.queryForList(sql,String.class);
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

}
