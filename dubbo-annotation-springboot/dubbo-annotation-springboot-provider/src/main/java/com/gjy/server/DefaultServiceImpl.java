package com.gjy.server;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DefaultDemoService
 * @Description:对外暴露接口实现类
 */
//demo.service.version 在application.properties中配置过了
@Service//dubbo注解
@Component
public class DefaultServiceImpl implements DefaultApiService {

    public String defaultMethod(String str) {
        return "hello " + str;
    }

}