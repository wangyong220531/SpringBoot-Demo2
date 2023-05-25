package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.req.UserReq;
import com.example.demo.resp.PageResp;

public interface UserService {
    PageResp<User> getList(UserReq userReq);
}
