package com.glinboy.demo.book.web.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class HomeController {

    @GetMapping
    ResponseEntity<String> getHome() {
        return ResponseEntity.ok("Welcome to Spring Boot Book by Groovy")
    }
}
