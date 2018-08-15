package com.panxiaoan.springcloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 订单服务
 * 
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a>
 * @since 2018-08-15 01:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class RunOrderServiceApp {
	
	public static void main(String[] args) {
		SpringApplication.run(RunOrderServiceApp.class, args);
	}

}