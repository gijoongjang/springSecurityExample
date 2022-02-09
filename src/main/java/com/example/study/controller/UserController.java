package com.example.study.controller;

import com.example.study.service.UserService;
import com.example.study.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/signUp")
    public String signUpForm() {
        System.out.println("접속완료!");
        return "signUp";
    }

//    @PostMapping("/signUp")
//    public String signUp(@RequestBody UserVO userVO){
//        try {
//            userService.insertUser(userVO);
//            return "redirect:/login";
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "error";
//    }

    @PostMapping("/signUp")
    @ResponseBody
    public Map<String, Object> signUp(@RequestBody UserVO userVO){
        Map<String, Object> retMap = new HashMap<String, Object>();
        try {
            retMap.put("succeed", true);
            userService.insertUser(userVO);
        } catch (Exception e) {
            retMap.put("succeed", false);
            retMap.put("errMessage", e.getMessage());
            e.printStackTrace();
        }

        return retMap;
    }
}
