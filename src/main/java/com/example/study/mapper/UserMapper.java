package com.example.study.mapper;

import com.example.study.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(UserVO userVO);
}
