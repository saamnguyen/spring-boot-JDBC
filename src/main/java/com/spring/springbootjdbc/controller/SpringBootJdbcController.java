package com.spring.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/insert")
    public String index(){
        jdbcTemplate.execute("insert into user(name,email)values('javatpoint','java@javatpoint.com')");
        return "data insert successfully";
    }
}
