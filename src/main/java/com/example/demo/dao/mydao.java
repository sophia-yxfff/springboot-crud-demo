package com.example.demo.dao;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface mydao {
    List<User> findAllUser();
}