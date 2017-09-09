package cn.ezt.pojo;

public class Role extends BaseInfo{
	private String roleId; //权限ID
	private String roleName; //权限名
	private String adminRole; //超级管理员权限 '0:关闭    1:打开',
	private String rootRole;//管理员权限 '0:关闭    1:打开',
	private String agentRole;//业务员权限'0:关闭    1:打开',
	private String userRole;//用户权限'0:关闭    1:打开',
	
	 
	 public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getAdminRole() {
		return adminRole;
	}
	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}
	public String getRootRole() {
		return rootRole;
	}
	public void setRootRole(String rootRole) {
		this.rootRole = rootRole;
	}
	public String getAgentRole() {
		return agentRole;
	}
	public void setAgentRole(String agentRole) {
		this.agentRole = agentRole;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", adminRole=" + adminRole + ", rootRole=" + rootRole + ", agentRole="
				+ agentRole + ", userRole=" + userRole + "]";
	}
	 
	 
}
