package usts.utils;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.HashSet;
import java.util.Set;

public class MyRealm extends AuthorizingRealm {

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //客户端传来的
        //本人，用户名
        Object username=authenticationToken.getPrincipal();
        //凭证，密码
        Object o= authenticationToken.getCredentials();
        System.out.println(username+"\t"+new String((char[])o));

        //拿着username去数据库找password和salt
        String password = "0a6912f11109577cf9ab7261bf1daad0";
        ByteSource salt = ByteSource.Util.bytes("adkid");

        AuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(username,password,salt,this.getName());

        return authenticationInfo;
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //从principalCollection中获取主身份
        String userCode= (String) principalCollection.getPrimaryPrincipal();
        //根据身份去查询数据库，得到他的权限
        Set permissions = new HashSet();
        permissions.add("item:delete");
        permissions.add("item:update");
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }


}
