package study.querydsl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Hello {

    @RestController
    public class HelloController {
        @GetMapping("/hello")
        public String hello() {
            return "hello!";
        }
    }
}
