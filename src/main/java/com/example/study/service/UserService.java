package com.example.study.service;

import com.example.study.mapper.UserMapper;
import com.example.study.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    private String getCurrentTimeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").format(new Date());
    }

    @Transactional
    public void insertUser(UserVO userVO){
        userVO.setPassword(passwordEncoder.encode(userVO.getPassword()));
        userVO.setUserAuth("USER");
        userVO.setCreateDate(getCurrentTimeStamp());
        userVO.setUpdateDate(getCurrentTimeStamp());

        userMapper.insertUser(userVO);
    }
}
