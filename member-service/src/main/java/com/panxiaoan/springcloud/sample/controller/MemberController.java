package com.panxiaoan.springcloud.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a>
 * @since 2018-08-15 09:55
 */
@RestController
@RequestMapping(value = "/member", method = RequestMethod.POST)
public class MemberController {
	
	private static Logger logger = LoggerFactory.getLogger(MemberController.class);

	/** 获取所有会员 */
	@RequestMapping(value = "/getAllMember")
	public List<String> getAllMember() {
		logger.info(">>> [MemberService] I'm MemberController");
		
		List<String> memberList = new ArrayList<>();
		memberList.add("Lucy");
		memberList.add("Lily");
		memberList.add("Jack");
		return memberList;
	}
}
