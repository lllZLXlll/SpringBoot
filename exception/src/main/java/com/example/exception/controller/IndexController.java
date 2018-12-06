package com.example.exception.controller;

import com.example.exception.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping("")
    public String index() {
        return indexService.index();
    }

    @RequestMapping("/1")
    public String index1() {
        return indexService.index1();
    }
}
