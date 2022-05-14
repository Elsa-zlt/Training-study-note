package com.web.items.controller;

import com.web.items.pojo.Items;
import com.web.items.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController 包含了 @ResponseBody 和 @Controller 注解
// @ResponseBody 把 Java 类型的数据转换成 json 类型数据
@RestController
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    //
    @GetMapping("findAll")
    public List<Items> findAll() {
        return itemsService.findAll();
    }

    @GetMapping("/findOne/{id}")
    public Items findOne(@PathVariable int id) {
        return itemsService.findOne(id);
    }

}
