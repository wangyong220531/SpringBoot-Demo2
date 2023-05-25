package com.example.demo.req.Controller;

import com.example.demo.entity.User;
import com.example.demo.req.UserReq;
import com.example.demo.resp.CommonResp;
import com.example.demo.resp.PageResp;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getList")
    public CommonResp getList(UserReq userReq) {
        CommonResp<PageResp<User>> resp = new CommonResp<>();
        PageResp<User> list = userService.getList(userReq);
        resp.setContent(list);
        return resp;
    }
}
