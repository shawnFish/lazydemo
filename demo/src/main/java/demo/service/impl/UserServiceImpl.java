/*******************************************************************************
 * Project Key : CPPII
 * Create on 2016��9��18�� ����12:32:12
 * Copyright (c) 2008 - 2011.��������ɿƼ����޹�˾��Ȩ����. ��ICP��16034195��
 * ע�⣺�����ݽ�������������ɿƼ��������޹�˾�ڲ����ģ���ֹ��й�Լ�������������ҵĿ��
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
 * @author ����Ѯ��15996226054��  2016��9��18�� ����12:32:12
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

