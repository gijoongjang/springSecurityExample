package com.example.study.service;

import com.example.study.mapper.UserMapper;
import com.example.study.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserMapper userMapper;

    private String getCurrentTimeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").format(new Date());
    }

    @Transactional
    public void insertUser(UserVO userVO){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        userVO.setPassword(bCryptPasswordEncoder.encode(userVO.getPassword()));
        userVO.setUserAuth("USER");
        userVO.setCreateDate(getCurrentTimeStamp());
        userVO.setUpdateDate(getCurrentTimeStamp());

        userMapper.insertUser(userVO);
    }

    @Override
    public UserVO loadUserByUsername(String userID) throws UsernameNotFoundException {
        UserVO userVO = userMapper.getUser(userID);

        if(userVO == null) {
            throw new UsernameNotFoundException("유저 정보 존재하지않음");
        }

        return userVO;
    }
}
