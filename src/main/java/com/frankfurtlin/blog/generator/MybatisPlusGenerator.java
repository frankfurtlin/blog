package com.frankfurtlin.blog.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author Frankfurtlin
 * @version 1.0
 * @date 2022/4/1 11:27
 */
public class MybatisPlusGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/blog?serverTimezone=UTC",
                "root", "123456")
                // 全局配置
                .globalConfig(builder -> {
                            // 设置作者
                    builder.author("frankfurtlin")
                            // 覆盖已生成文件
                            // .fileOverride()
                            // 指定输出目录
                            .outputDir(System.getProperty("user.dir")+ "\\src\\main\\java")
                            // 开启 swagger 模式
                            // .enableSwagger()
                            // 注释日期
                            .commentDate("yyyy-MM-dd");
                })
                // 包配置
                .packageConfig(builder -> {
                            // 设置父包名
                    builder.parent("com.frankfurtlin.blog")
                            // 设置父包模块名
                            // .moduleName()
                            .entity("entity")
                            .service("service")
                            .serviceImpl("service/serviceImpl")
                            .controller("controller")
                            .mapper("mapper")
                            .xml("mapper")
                            // 路径配置信息
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,
                                    System.getProperty("user.dir")+"\\src\\main\\resources\\mapper"));
                })
                // 策略配置
                .strategyConfig(builder -> {
                            // 增加表匹配(内存过滤)
                    builder.addInclude("user", "blog");
                })
                //使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}