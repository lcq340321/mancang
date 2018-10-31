package com.leyou.controller;

import com.leyou.pojo.User;
import com.leyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
    *   ctrl + n 快速打开类 rest
    *
    *
    * */
@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping ("hello/{id}")
      public User hello(@PathVariable("id")Long id){
          return userService.queryById(id );
        }
    }

