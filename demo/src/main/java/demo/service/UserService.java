package demo.service;

import demo.model.User;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author ����Ѯ��15996226054��  2016��9��18�� ����12:31:24
 */
public interface UserService {
	/**
	 * <p>TODO</p>
	 * @param Id
	 * @return
	 * @author ����Ѯ��15996226054��  2016��9��18�� ����12:31:26
	 */
	public User getUser(long Id);
	
	/**
	 * <p>TODO</p>
	 * @param user
	 * @author ����Ѯ��15996226054��  2016��9��18�� ����2:44:25
	 */
	public int insertUser(User user);
	
	/**
	 * <p>TODO</p>
	 * @param id
	 * @return
	 * @author ����Ѯ��15996226054��  2016��9��18�� ����2:45:51
	 */
	public int deleteUser(long id);
	
	/**
	 * <p>TODO</p>
	 * @param user
	 * @return
	 * @author ����Ѯ��15996226054��  2016��9��18�� ����2:45:53
	 */
	public int updateUser(User user);
}
