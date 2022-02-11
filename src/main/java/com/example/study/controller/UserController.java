package com.example.study.controller;

import com.example.study.service.UserService;
import com.example.study.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @GetMapping
    public String root(){
        System.out.println("루트접속");
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/signUp")
    public String signUpForm() {
        return "signUp";
    }

    @GetMapping("/user_access")
    public String userAccess(Model model, Authentication authentication) {
        UserVO userVO = (UserVO) authentication.getPrincipal();
        model.addAttribute("userInfo", userVO.getId() + "님의" + userVO.getUserName() + "님");
        return "user_access";
    }

    @GetMapping("/access_reject")
    public String accessReject(){
        return "access_reject";
    }

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
