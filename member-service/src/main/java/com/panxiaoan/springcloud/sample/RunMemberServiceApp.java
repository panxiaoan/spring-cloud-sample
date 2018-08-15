package com.panxiaoan.springcloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 会员服务
 *  
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a> 
 * @since 2018-08-15 01:00 
 */
@SpringBootApplication
@EnableEurekaClient
public class RunMemberServiceApp {
	
	public static void main(String[] args) {
		SpringApplication.run(RunMemberServiceApp.class, args);
	}
	
	/** Ribbon 客户端负载均衡，默认轮询策略 */
	@Bean
	@LoadBalanced
	RestTemplate newRestTemplate() {
		return new RestTemplate();
	}
}