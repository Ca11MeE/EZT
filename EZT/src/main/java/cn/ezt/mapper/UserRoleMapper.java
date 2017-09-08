package cn.ezt.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {

	@Insert("insert into user_role(user_id,role_id) values(#{userId},#{roleId})")
	void createUserRole(@Param("userId")String userId, @Param("roleId")String roleId);
	
}
