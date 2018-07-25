package ssm.blog.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import ssm.blog.entity.Blogger;
import ssm.blog.service.BloggerService;

/**
 * @author chen
 *
 */
public class MyRealm extends AuthorizingRealm {

	@Resource
	private BloggerService bloggerService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {

		String username = (String) token.getPrincipal(); 
		Blogger blogger = bloggerService.getByUsername(username); 
		if (blogger != null) {
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", blogger);
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(
					blogger.getUsername(), blogger.getPassword(), "MyRealm");
			return authcInfo;
		} else {
			return null;
		}

	}

}
