package com.panxiaoan.springcloud.sample.feign.member;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

/** 
 * 会员服务 memeber-service 调用失败后, Hystrix 容错处理
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a> 
 * @since 2018-08-19 00:11 
 */
@Component
public class MemberServiceFeignClientFallback implements MemberServiceFeignClient {

	@Override
	public List<String> getAllMember() {
		return Arrays.asList("调用会员服务失败");
	}

}
