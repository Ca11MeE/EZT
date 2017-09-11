package cn.ezt.service;

import java.util.List;

import cn.ezt.pojo.User;

public interface UserService {

	List<User> findAll();

	User findUserByUP(String username, String password);

	void createUser(User user);

	User findUserName(String userName);

	List<User> findUserAndRole();

	User findUserByName(String username);

}
