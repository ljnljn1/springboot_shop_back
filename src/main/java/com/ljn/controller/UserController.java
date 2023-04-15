package com.ljn.controller;

import com.ljn.po.User;
import com.ljn.service.UserSercvice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/*
  @Author:lijingnan
  @Date:2023/4/13 16:23
  @Description:
*/
@RequestMapping("/user")
@RestController
public class UserController {
    @Resource
    private UserSercvice userSercvice;
    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
      System.out.println("hello");
       return userSercvice.getAllUser();
    }
    @RequestMapping("/userList")
    public String userList(Model model){
        model.addAttribute("name","tom");
        List<User> allUser = userSercvice.getAllUser();
        model.addAttribute("users",allUser);
        return "userList";
    }

    @RequestMapping("/addUser")
    public  List<String> addUser(@Validated User user, BindingResult br){
        System.out.println(user);
        List<ObjectError> allErrors = br.getAllErrors();
        List<String> errolist=new ArrayList<>();
        for (ObjectError allError : allErrors) {
            String defaultMessage = allError.getDefaultMessage();
            errolist.add(allError.getObjectName()+":"+defaultMessage+":"+allError.getCode());
        }
        return errolist;
    }
}
