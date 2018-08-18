package com.panxiaoan.springcloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.internal.EnableZipkinServer;

/**
 * 分布式链路追踪服务
 * 
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a>
 * @since 2018-08-18 00:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class RunZipkinServerApp {

	public static void main(String[] args) {
		SpringApplication.run(RunZipkinServerApp.class, args);
	}
}
