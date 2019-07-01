package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Email;
import com.qf.service.IEmailservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @version 1.0
 * @user cgc
 * @date 2019/6/29 17:45
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private IEmailservice iEmailservice;


    @RequestMapping("/toinsert")
    public  String toInsertPage(Model model){
        List<Email> emails = iEmailservice.queryAll();
        model.addAttribute("emails",emails);
        return "useradd";
    }
}
