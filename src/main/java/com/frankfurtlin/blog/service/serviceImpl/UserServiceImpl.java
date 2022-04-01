package com.frankfurtlin.blog.service.serviceImpl;

import com.frankfurtlin.blog.entity.User;
import com.frankfurtlin.blog.mapper.UserMapper;
import com.frankfurtlin.blog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author frankfurtlin
 * @since 2022-04-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
