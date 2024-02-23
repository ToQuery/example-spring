package io.github.toquery.example.spring.controller;

import io.github.toquery.example.spring.service.HttpBinService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/http-bin")
public class HttpBinController {

    @Resource
    private HttpBinService httpBinService;

    @GetMapping(value = "/deploy/{deploy}")
    public Map<String, Object> deploy(@PathVariable Integer deploy){
        return httpBinService.deploy(deploy);
    }
}
