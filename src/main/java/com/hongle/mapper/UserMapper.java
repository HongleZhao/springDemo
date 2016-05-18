/**  
 * @Title: UserMapper.java
 * @Package com.hongle.mapper
 * @Description: TODO
 * @author ZhaoHongle
 * @date 2016年5月18日 下午4:56:09
 */
package com.hongle.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hongle.modal.User;

/**
 * ClassName: UserMapper
 * @Description: TODO
 * @author ZhaoHongle
 * @date 2016年5月18日 下午4:56:09
 */
@Repository
public interface UserMapper {
	
	List<User> getList();
}
