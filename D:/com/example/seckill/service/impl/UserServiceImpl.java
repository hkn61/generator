package com.example.seckill.service.impl;

import com.example.seckill.pojo.User;
import com.example.seckill.mapper.UserMapper;
import com.example.seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hkn
 * @since 2023-06-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
