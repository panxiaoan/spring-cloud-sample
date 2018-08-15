package com.panxiaoan.springcloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 会员服务
 *  
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a> 
 * @since 2018-08-15 01:00 
 */
@SpringBootApplication
@EnableEurekaClient
public class RunZullServerApp {
	public static void main(String[] args) {
		SpringApplication.run(RunZullServerApp.class, args);
	}
}