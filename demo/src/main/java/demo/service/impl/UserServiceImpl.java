/*******************************************************************************
 * Project Key : CPPII
 * Create on 2016年9月18日 下午12:32:12
 * Copyright (c) 2008 - 2011.深圳市齐采科技有限公司版权所有. 粤ICP备16034195号
 * 注意：本内容仅限于深圳市齐采科技服务有限公司内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
package demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.UserMapper;
import demo.model.User;
import demo.service.UserService;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 王保旬（15996226054）  2016年9月18日 下午12:32:12
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	/**
	 * @see demo.service.UserService#getUser(long)
	 */
	public User getUser(long Id) {
		return userMapper.selectByPrimaryKey(Id);
	}

	/**
	 * @see demo.service.UserService#insertUser(demo.model.User)
	 */
	public int insertUser(User user) {
		int num = userMapper.insert(user);
		return num;
	}

	/**
	 * @see demo.service.UserService#deleteUser(long)
	 */
	public int deleteUser(long id) {
		int num = userMapper.deleteByPrimaryKey(id);
		return num;
	}

	/**
	 * @see demo.service.UserService#updateUser(demo.model.User)
	 */
	public int updateUser(User user) {
		if (user.getUserId() == null)
			return 0;
		int num = userMapper.updateByPrimaryKey(user);
		return num;
	}
	
	

}

