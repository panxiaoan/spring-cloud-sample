package com.panxiaoan.springcloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 订单服务
 * 
 * @EnableEurekaClient 开启服务注册和发现
 * @EnableFeignClients 开启 Feign 客户端
 * @EnableHystrix 开启 Hystrix
 * 
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a>
 * @since 2018-08-15 01:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix 
public class RunOrderServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(RunOrderServiceApp.class, args);
	}

}