/**
* 
* @author Mity1299
*/
package com.didispace.bizImpl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.didispace.biz.UserBiz;
import com.didispace.entity.User;
import com.didispace.mapper.UserMapper;

/**
 * @author Mity1299
 *
 */
@Service(value="userBiz")
public class UserBizImpl implements UserBiz {

    @Autowired
    UserMapper userMapper;
    
    
    @Cacheable(value ="content",key = "targetClass + methodName + #p0 + #p1")
    @Override
    public User selectById(Long id) {
        // TODO Auto-generated method stub
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
   

}
