package com.shubhtech.springbootwork.controller;


import com.shubhtech.springbootwork.model.MyEntity;
import com.shubhtech.springbootwork.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
public class MyController {

    @Autowired
    private MyService service;

    @RequestMapping("/get")
    public List<MyEntity> getAllEntities(){

        return service.getAllEntities();
    }

    @RequestMapping("/save")
    public MyEntity createEntity(@RequestBody MyEntity entity){
        return service.saveEntity(entity);
    }

}
