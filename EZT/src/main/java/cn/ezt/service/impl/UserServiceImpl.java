package cn.ezt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ezt.mapper.UserMapper;
import cn.ezt.pojo.User;
import cn.ezt.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public User findUserByUP(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUP(username,password);
	}

}
