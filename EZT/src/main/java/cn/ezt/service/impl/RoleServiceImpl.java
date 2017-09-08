package cn.ezt.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ezt.mapper.RoleMapper;
import cn.ezt.mapper.UserMapper;
import cn.ezt.pojo.Role;
import cn.ezt.pojo.User;
import cn.ezt.service.RoleService;
import cn.ezt.service.UserService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public List<Role> findAll() {
		return roleMapper.findAll();
	}

	@Override
	public Role findRoleById(String roleId) {
		return roleMapper.findRoleById(roleId);
	}

	


}
