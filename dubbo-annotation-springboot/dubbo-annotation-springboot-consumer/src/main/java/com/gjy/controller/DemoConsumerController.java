package com.gjy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gjy.server.DefaultApiService;

/**
 * @ClassName: DemoConsumerController
 * @Description:web调用服务提供者对外暴露的rpc接口
 */
@RestController
public class DemoConsumerController {

    /**
     * 引入服务提供者
     */
    // com.alibaba.dubbo.config.annotation.Reference
    @Reference
    private DefaultApiService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.defaultMethod(name);
    }

}