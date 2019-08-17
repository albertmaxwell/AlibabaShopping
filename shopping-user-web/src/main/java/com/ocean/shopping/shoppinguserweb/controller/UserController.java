package com.ocean.shopping.shoppinguserweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ocean.shopping.bean.UserMembers;
import com.ocean.shopping.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * @author 金海洋
 * @describe
 * @date 2019/8/10  12:42
 */
@Controller
@RequestMapping("/userController")
public class UserController {

	@Reference
	UserService userService;

	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	@ResponseBody
	public List<UserMembers> getAllUser(){

		List<UserMembers> userMembers= userService.getAllUser();

		return userMembers;
	}
}
