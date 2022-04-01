package com.frankfurtlin.blog.controller;


import com.frankfurtlin.blog.entity.User;
import com.frankfurtlin.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author frankfurtlin
 * @since 2022-04-01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService iuserService;

    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        return iuserService.getById(id);
    }

    @PostMapping("/save")
    public Object save(@RequestBody User user){
        System.out.println(user);
        return iuserService.save(user);
    }
}
