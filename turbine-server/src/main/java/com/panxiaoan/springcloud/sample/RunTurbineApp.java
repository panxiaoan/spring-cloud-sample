package com.panxiaoan.springcloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 订单服务
 * 
 * @EnableTurbine 开启聚合监控 
 * 
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a>
 * @since 2018-08-15 01:00
 */
@SpringBootApplication
@EnableTurbine
public class RunTurbineApp {

	public static void main(String[] args) {
		SpringApplication.run(RunTurbineApp.class, args);
	}

}