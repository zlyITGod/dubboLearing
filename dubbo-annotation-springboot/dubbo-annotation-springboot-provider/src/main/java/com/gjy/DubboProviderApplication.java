package com.gjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

/**
 * @Auther: 郭敬仰
 * @Date: 2018/12/13 17:13
 * @Description:
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.gjy.server")
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
