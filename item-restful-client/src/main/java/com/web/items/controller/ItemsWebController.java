package com.web.items.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemsWebController {

    @Autowired
    private RestTemplate restTemplate;

    public String baseURL = "http://localhost:8088/";

    @GetMapping("queryItems")
    public ModelAndView queryItems() {
        // 泛型： LinkedHashMap
        List list = restTemplate.getForObject(baseURL + "findAll", List.class);
        System.out.println(list);

        ModelAndView mv = new ModelAndView();
        mv.addObject("itemList",list);
        mv.setViewName("index");
        return mv;
    }

}
