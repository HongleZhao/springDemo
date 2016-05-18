/**  
 * @Title: UserService.java
 * @Package com.hongle.service
 * @Description: TODO
 * @author ZhaoHongle
 * @date 2016年5月18日 下午5:05:15
 */
package com.hongle.servce.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongle.mapper.UserMapper;
import com.hongle.modal.User;
import com.hongle.service.UserService;

/**
 * ClassName: UserService
 * @Description: TODO
 * @author ZhaoHongle
 * @date 2016年5月18日 下午5:05:15
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getList(){
		return userMapper.getList();
	}
}
