/**
* 
* @author Mity1299
*/
package com.didispace.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.didispace.biz.UserBiz;
import com.didispace.entity.Role;
import com.didispace.entity.User;
import com.didispace.enums.EnumRole;
import com.didispace.mapper.RoleMapper;
import com.didispace.mapper.UserMapper;

/**
 * @author Mity1299
 *
 */
@Service
public class DbUserDetailsService implements UserDetailsService{

    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    


    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        if(userId!=null) {
            Integer uId = Integer.parseInt(userId);
            
            //根据用户编号查找
            User user = userMapper.selectByPrimaryKey(uId);
            
            Role role = roleMapper.selectByPrimaryKey(user.getRoleId());
            
            if( role!=null && role.getRoleName()!=null) {
                List<GrantedAuthority> grantedAuthorities  = new ArrayList<GrantedAuthority>();
                
                if(role.getRoleName().equals(EnumRole.ORGANIZER.getDescription())) {
                    
                    grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
                    grantedAuthorities.add(new SimpleGrantedAuthority(EnumRole.NORMAL.getDescription()));
                    
                }else {
                    grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
                }
                
                return new org.springframework.security.core.userdetails.
                        User(userId, user.getPasswd(), grantedAuthorities);
                 
            }
            
        }
        
        return null;
    }

}
