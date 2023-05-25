package com.example.demo.req;

import lombok.Data;

@Data
public class UserReq extends pageReq{
    private String name;
    private String phone;
    private String city;
}
