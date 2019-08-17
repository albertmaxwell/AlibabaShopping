package com.ocean.shopping.shoppinguserservice.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.ocean.shopping.bean.UserMembers;
import com.ocean.shopping.service.UserService;
import com.ocean.shopping.shoppinguserservice.mapper.UserMapper;



import javax.annotation.Resource;
import java.util.List;

/**
 * @author 金海洋
 * @describe
 * @date 2019/8/10  12:44
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;


	@Override
	public List<UserMembers> getAllUser() {

		//List<UserMembers> userMembers=userMapper.selectAllUser();
		List<UserMembers> userMembers=userMapper.selectAll();
		return userMembers;
	}
}
