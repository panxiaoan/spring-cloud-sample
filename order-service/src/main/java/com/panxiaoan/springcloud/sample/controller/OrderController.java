package com.panxiaoan.springcloud.sample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.panxiaoan.springcloud.sample.fegin.member.MemberServiceApi;

/** 
 * @author <a href="mailto:xiaoan.pan@qq.com">潘小安</a> 
 * @since 2018-08-15 09:59 
 */
@RestController
@RequestMapping(value = "/api/order", method = RequestMethod.POST)
public class OrderController {
	
	private static Logger logger = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private MemberServiceApi memberServiceApi;
	
	/** 从会员服务中获取所有会员，并显示 */
	@RequestMapping(value = "/showAllMember", method = RequestMethod.GET)
	public List<String> showAllMember() {
		logger.info(">>> [OrderService] I'm OrderController");
		return memberServiceApi.getAllMember();
	}
}
