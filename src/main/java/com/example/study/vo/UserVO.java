package com.example.study.vo;

import lombok.Data;

@Data
public class UserVO {
    private int no           ;
    private String id        ;
    private String password  ;
    private String userName  ;
    private String userAuth  ;
    private String createDate;
    private String updateDate;
}
