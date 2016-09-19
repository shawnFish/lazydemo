package demo.service;

import demo.model.User;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 王保旬（15996226054）  2016年9月18日 下午12:31:24
 */
public interface UserService {
	/**
	 * <p>TODO</p>
	 * @param Id
	 * @return
	 * @author 王保旬（15996226054）  2016年9月18日 下午12:31:26
	 */
	public User getUser(long Id);
	
	/**
	 * <p>TODO</p>
	 * @param user
	 * @author 王保旬（15996226054）  2016年9月18日 下午2:44:25
	 */
	public int insertUser(User user);
	
	/**
	 * <p>TODO</p>
	 * @param id
	 * @return
	 * @author 王保旬（15996226054）  2016年9月18日 下午2:45:51
	 */
	public int deleteUser(long id);
	
	/**
	 * <p>TODO</p>
	 * @param user
	 * @return
	 * @author 王保旬（15996226054）  2016年9月18日 下午2:45:53
	 */
	public int updateUser(User user);
}
