package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.req.UserReq;
import com.example.demo.resp.PageResp;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public PageResp<User> getList(UserReq userReq) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (!ObjectUtils.isEmpty(userReq.getName())) {
            queryWrapper.lambda().eq(User::getName, userReq.getName());
        }
        if (!ObjectUtils.isEmpty(userReq.getPhone())) {
            queryWrapper.lambda().eq(User::getPhone, userReq.getPhone());
        }
        if (!ObjectUtils.isEmpty(userReq.getCity())) {
            queryWrapper.lambda().eq(User::getCity, userReq.getCity());
        }
        Page<User> page = new Page<>(userReq.getPageNum(), userReq.getPageSize());
        IPage<User> userIPage = userMapper.selectPage(page, queryWrapper);
        PageResp<User> pageResp = new PageResp<>();
        pageResp.setTotal(userIPage.getTotal());
        pageResp.setList(userIPage.getRecords());
        return pageResp;
    }
}
