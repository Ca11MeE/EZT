package cn.ezt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.ezt.pojo.User;

public interface UserMapper {
	
	@Select("select * from user")
	public List<User> findAll();

	
	public User findUserByUP(@Param("username")String username, @Param("password")String password);

	
	public void createUser(User user);

	@Select("select username from user where username=#{userName}")
	public User findUserName(String userName);


	public List<User> findUserAndRole();


	public User findUserByName(String username);
}
