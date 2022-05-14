package com.web.items.controller;

import com.web.items.pojo.Items;
import com.web.items.pojo.RespBean;
import com.web.items.service.ItemsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController 包含了 @ResponseBody 和 @Controller 注解
// @ResponseBody 把 Java 类型的数据转换成 json 类型数据
@RestController
@Api(tags = "ItemsController", description = "产品后台微服务")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @ApiOperation("查询所有商品信息")
    @GetMapping("findAll")
    public List<Items> findAll() {
        return itemsService.findAll();
    }

    @ApiOperation("根据唯一id查询商品信息")
    @GetMapping("/findOne/{id}")
    public Items findOne(@ApiParam("要查找的商品id") @PathVariable int id) {
        return itemsService.findOne(id);
    }

    @ApiOperation("添加商品信息")
    // @RequestBody 把 json 格式转换成 Java 对象
    @PostMapping("/addItems")
    public RespBean addItems(@ApiParam("要添加的商品对象") @RequestBody Items items) {
        System.out.println(items.getName());
        System.out.println(items.getDetail());
        try {
            // id会回填到items对象中
            itemsService.addItems(items);
            return RespBean.ok("添加成功",items);
        } catch (Exception e) {
            e.printStackTrace();
            return RespBean.err("添加失败");
        }
    }

    @ApiOperation("根据唯一id更新商品信息")
    @PutMapping("/updateItems")
    public RespBean updateItems(@ApiParam("要更新的商品对象") @RequestBody Items items) {
        System.out.println(items.getName());
        System.out.println(items.getDetail());
        try {
            // id会回填到items对象中
            itemsService.updateItems(items);
            return RespBean.ok("修改成功",items);
        } catch (Exception e) {
            e.printStackTrace();
            return RespBean.err("修改失败");
        }
    }

    @ApiOperation("根据唯一id删除商品信息")
    @DeleteMapping("/deleteItems/{id}")
    public RespBean deleteItems(@ApiParam("要删除的商品id") @PathVariable int id) {
        try {
            // id会回填到items对象中
            itemsService.deleteItems(id);
            return RespBean.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return RespBean.err("删除失败");
        }
    }





}
