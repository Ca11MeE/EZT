package cn.ezt.servlet;

import cn.ezt.dao.UserDao;

public class UserDaoImpl implements UserDao {

	public boolean findUserByUserNameAndPwd(String username, String password) {
		String sql="select * from user where username=?,password=?";
		return true;
	}

}
