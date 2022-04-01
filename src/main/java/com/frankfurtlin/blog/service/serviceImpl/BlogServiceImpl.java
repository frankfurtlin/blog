package com.frankfurtlin.blog.service.serviceImpl;

import com.frankfurtlin.blog.entity.Blog;
import com.frankfurtlin.blog.mapper.BlogMapper;
import com.frankfurtlin.blog.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
