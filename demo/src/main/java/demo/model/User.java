package demo.model;

import java.io.Serializable;

public class User implements Serializable {
    /**
	 * TODO
	 */
	private static final long serialVersionUID = -7773651153131723778L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_ID
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_NAME
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.PASSWORD
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_ID
     *
     * @return the value of user.USER_ID
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_ID
     *
     * @param userId the value for user.USER_ID
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_NAME
     *
     * @return the value of user.USER_NAME
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_NAME
     *
     * @param userName the value for user.USER_NAME
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.PASSWORD
     *
     * @return the value of user.PASSWORD
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.PASSWORD
     *
     * @param password the value for user.PASSWORD
     *
     * @mbggenerated Sun Sep 18 12:24:02 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}