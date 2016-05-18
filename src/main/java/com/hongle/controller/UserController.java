/**  
 * @Title: UserController.java
 * @Package com.hongle.controller
 * @Description: TODO
 * @author ZhaoHongle
 * @date 2016年5月18日 下午5:11:41
 */
package com.hongle.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hongle.modal.User;
import com.hongle.service.UserService;

/**
 * ClassName: UserController
 * @Description: TODO
 * @author ZhaoHongle
 * @date 2016年5月18日 下午5:11:41
 */
@Controller
@RequestMapping("/user")
public class UserController{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> getUserList(){
		//System.out.println("====id====>>>"+id);
		System.out.println("====list size====>>>"+userService.getList().size());
		return userService.getList();
	}
	
}
