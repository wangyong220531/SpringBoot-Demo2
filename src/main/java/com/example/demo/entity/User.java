package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class User {
    private long id;
    private String name;
    private int age;
    private String sex;
    private String phone;
    private String city;
}
