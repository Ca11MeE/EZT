package cn.ezt.shiro;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ezt.pojo.User;
import cn.ezt.service.RoleService;
import cn.ezt.service.UserService;



public class AuthRealm extends AuthorizingRealm {
	@Resource
	private UserService userService;
	@Autowired
	private RoleService roleService;

	// 权限验证
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		暂时不做权限过滤
//		
//		
//		List<String> roleList=roleService.findRoleNameById(((User)SecurityUtils.getSubject().getPrincipal()).getUserId());
//		
//		
//		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
//		info.addStringPermissions(roleList);
		return null;
	}

	@Override
	// 登陆认证模块
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken uptoken = (UsernamePasswordToken) token;

		String username = uptoken.getUsername();

		User user = userService.findUserByName(username);
		
		/*
		 * principal -> 真实的用户对象
		 * credentials -> 真实的密码
		 * realmName -> 当前Realm名称
		 */
		AuthenticationInfo info =new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
		return info;

	}

}
