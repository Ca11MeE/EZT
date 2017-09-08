package cn.ezt.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ezt.mapper.RoleMapper;
import cn.ezt.mapper.UserMapper;
import cn.ezt.mapper.UserRoleMapper;
import cn.ezt.pojo.Role;
import cn.ezt.pojo.User;
import cn.ezt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Autowired
	RoleMapper roleMapper;
	@Autowired
	UserRoleMapper userRoleMapper;

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public User findUserByUP(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUP(username, password);
	}

	@Override
	public void createUser(User user) {
		String roleId = UUID.randomUUID().toString();
		/*
		 * 通过注册页面注册的都是默认用户权限
		 */
		Role role = new Role();
		role.setRoleId(roleId);
		role.setRoleName(user.getUsername());
		role.setAdminRole("0");
		role.setAgentRole("0");
		role.setRootRole("0");
		role.setUserRole("1");
		// 设定基础信息
		role.setCreateTime(new Date());
		role.setUpdateTime(role.getCreateTime());
		role.setCreateBy(user.getName());
		role.setUpdateBy(user.getName());
		// 设定ID
		user.setUserId(UUID.randomUUID().toString());
		// 设定权限
		user.setRole(role);
		// 设定基础信息
		user.setCreateTime(role.getCreateTime());
		user.setUpdateTime(role.getCreateTime());
		user.setCreateBy(user.getName());
		user.setUpdateBy(user.getName());
		// 添加权限
		roleMapper.createRole(role);
		// 添加用户
		userMapper.createUser(user);
		// 关联用户和权限
		userRoleMapper.createUserRole(user.getUserId(), role.getRoleId());
	}

	@Override
	public User findUserName(String userName) {
		return userMapper.findUserName(userName);
	}

}
