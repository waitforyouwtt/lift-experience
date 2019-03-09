package com.yidiandian.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 一点点
 * @Date: 2019/3/9 14:53
 * @Version 1.0
 */
@Slf4j
@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "hello,this is index";
    }
}
