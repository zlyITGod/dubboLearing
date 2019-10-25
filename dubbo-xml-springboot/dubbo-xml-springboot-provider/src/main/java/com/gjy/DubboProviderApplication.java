package com.gjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName:  DubboProviderApplication   
 * @Description:服务提供者启动类  
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.gjy"})
@ImportResource(locations="classpath:provider.xml")
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args); 
	}

}
