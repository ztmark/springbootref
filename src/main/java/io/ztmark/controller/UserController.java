package io.ztmark.controller;

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

    @RequestMapping("/{username}")
    public String greeting(@PathVariable("username") String username) {
        return "Hello " + username;
    }

}
