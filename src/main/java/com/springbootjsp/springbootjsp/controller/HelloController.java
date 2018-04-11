package com.springbootjsp.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author gaoyun
 * 2018/4/11 9:05
 * 描述:
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        map.put("name","jsp");
        return "index";
    }
}
