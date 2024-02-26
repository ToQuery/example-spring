package io.github.toquery.example.spring.controller;

import io.micrometer.observation.annotation.Observed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloWorldController {

    @Observed(name = "hello-world-controller")
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
