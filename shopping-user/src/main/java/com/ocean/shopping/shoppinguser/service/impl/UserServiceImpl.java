package com.ocean.shopping.shoppinguser.service.impl;


import com.ocean.shopping.shoppinguser.bean.UserMembers;
import com.ocean.shopping.shoppinguser.mapper.UserMapper;
import com.ocean.shopping.shoppinguser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 金海洋
 * @describe
 * @date 2019/8/10  12:44
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;


	@Override
	public List<UserMembers> getAllUser() {

		//List<UserMembers> userMembers=userMapper.selectAllUser();
		List<UserMembers> userMembers=userMapper.selectAll();
		return userMembers;
	}
}
