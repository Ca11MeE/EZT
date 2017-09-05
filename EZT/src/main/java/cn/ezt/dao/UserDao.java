package cn.ezt.dao;

public interface UserDao {
	public boolean findUserByUserNameAndPwd(String username,String password);
}
