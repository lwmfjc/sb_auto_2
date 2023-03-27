package cn.controller;

import com.service.ILyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ILyService lyService;

    @RequestMapping("hello")
    public String hello(){
        return lyService.say()+"hello ,world";
    }
}
