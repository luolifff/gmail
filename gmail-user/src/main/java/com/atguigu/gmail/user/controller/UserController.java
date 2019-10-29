package com.atguigu.gmail.user.controller;

import com.atguigu.gmail.user.bean.UmsMember;
import com.atguigu.gmail.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmail.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    public UmsMemberReceiveAddress getReceiveAddressByMemberId(){
        return null;
    }

    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("index")
    public String index(){
        return "hello user";
    }
}
