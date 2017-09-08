package cn.ezt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.ezt.pojo.Role;

public interface RoleMapper {
	
	@Select("select * from role_info")
	List<Role> findAll();

	@Select("select * from role_info where role_id=#{roleId}")
	Role findRoleById(String roleId);

	void createRole(Role role);
}
