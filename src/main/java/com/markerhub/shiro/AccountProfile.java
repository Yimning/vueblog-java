package com.markerhub.shiro;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountProfile implements Serializable {
    //封装与序列化
    private Long id;

    private String username;

    private String avatar;

    private String email;

}
