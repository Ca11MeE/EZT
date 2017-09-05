package cn.ezt.servlet;

import cn.ezt.dao.UserDao;
import cn.ezt.service.UserService;

public class UserServiceImpl implements UserService {

	public boolean findUserByUserNameAndPwd(String username, String password) {
		UserDao uDao=new UserDaoImpl();
		return uDao.findUserByUserNameAndPwd(username, password);
	}

}
