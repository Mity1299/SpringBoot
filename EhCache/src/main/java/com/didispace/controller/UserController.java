/**
* 
* @author Mity1299
*/
package com.didispace.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.didispace.biz.UserBiz;
import com.didispace.entity.User;
import com.didispace.mapper.UserMapper;


/**
 * @author Mity1299
 *
 */
@Validated
@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    UserBiz userBiz;
    
    @RequestMapping(value="/getUser")
    public User getUser(@RequestParam Long id){
        User user =userBiz.selectById(id);
        
        return user;
    }
    
    
    @RequestMapping(value="/main")
    public String showMainPage(@RequestParam Long id,
                        ModelMap map){
        User user =userBiz.selectById(id);
        map.addAttribute("user", user);
        return "main.jsp";
    }
    

}
