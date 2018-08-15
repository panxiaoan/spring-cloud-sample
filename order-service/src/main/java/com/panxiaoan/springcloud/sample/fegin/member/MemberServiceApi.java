package com.panxiaoan.springcloud.sample.fegin.member;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 通过 Fegin 调用 会员服务
 * 
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a>
 * @since 2018-08-15 10:01
 */
@FeignClient(name = "member-service")
public interface MemberServiceApi {

	@RequestMapping(value = "/api/member/getAllMember", method = RequestMethod.POST)
	List<String> getAllMember();
}
