package com.zhoufu.yygh.common.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: zhoufu
 * @Date: 2022/3/8 16:35
 * @description:  mybatis-plus配置类
 */
@EnableTransactionManagement // 事务处理
@Configuration
@MapperScan("com.zhoufu.yygh.*.mapper")
public class MybatisPlusConfig {

    /**
     *  分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        paginationInterceptor.setLimit(你的最大单页限制数量，默认500条，小于0 如-1 不受限制);
        return paginationInterceptor;
    }

    /**
     *  乐观锁配置
     * @return
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }
}
