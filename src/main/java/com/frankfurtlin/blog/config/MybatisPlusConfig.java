package com.frankfurtlin.blog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Frankfurtlin
 * @version 1.0
 * @date 2022/4/1 11:22
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.frankfurtlin.blog.mapper")
public class MybatisPlusConfig {

}
