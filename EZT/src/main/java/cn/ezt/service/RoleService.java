package cn.ezt.service;

import java.util.List;

import cn.ezt.pojo.Role;
import cn.ezt.pojo.User;

public interface RoleService {

	List<Role> findAll();

	Role findRoleById(String roleId);



}
