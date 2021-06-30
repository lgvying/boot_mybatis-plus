package com.zut.boot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 梁贵莹
 * @create 2021/6/30 下午 10:05
 */
//扫描mapper文件夹
@MapperScan("com.zut.boot.mapper")
@Configuration
//开启事务管理
@EnableTransactionManagement
public class MyBatis_plus_config {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


}
