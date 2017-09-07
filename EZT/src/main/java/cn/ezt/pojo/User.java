package cn.ezt.pojo;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class User extends BaseInfo{
	private String userId; //用户ID
	private String username; //用户登录名
	private String password; //用户密码
	private String name; //用户真实姓名
	private String gender;	//用户性别
	private String telephone; //用户手机号
	private String address; //用户地址
	private Role role;
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", gender=" + gender + ", telephone=" + telephone + ", address=" + address + ", role=" + role + "]";
	}

	
	
}
