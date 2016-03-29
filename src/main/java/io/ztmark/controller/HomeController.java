package io.ztmark.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Mark
 * Date  : 16/3/25
 */
@RestController
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String home() {
        return "Hello Spring Boot!";
    }

}
