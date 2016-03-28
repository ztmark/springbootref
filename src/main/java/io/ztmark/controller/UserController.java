package io.ztmark.controller;

import io.ztmark.domain.User;
import io.ztmark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Mark
 * Date  : 16/3/25
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{username}")
    public String greeting(@PathVariable("username") String username) {
        return "Hello " + username + " " + userService.getUser();
    }

}
