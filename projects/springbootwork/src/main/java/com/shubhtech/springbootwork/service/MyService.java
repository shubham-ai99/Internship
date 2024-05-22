package com.shubhtech.springbootwork.service;

import com.shubhtech.springbootwork.model.MyEntity;
import com.shubhtech.springbootwork.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private MyRepository repository;

    public List<MyEntity> getAllEntities(){
        return repository.findAll();
    }

    public MyEntity saveEntity(MyEntity entity){
        return repository.save(entity);
    }


}
