package com.panxiaoan.springcloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 运行 Eureka 服务注册与发现中心
 *  
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a> 
 * @since 2018-08-15 00:58 
 */
@SpringBootApplication
@EnableEurekaServer
public class RunEurekaServerApp {
	public static void main(String[] args) {
		SpringApplication.run(RunEurekaServerApp.class, args);
	}
}