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
import com.didispace.validator.group.User1Group;

/**
 * @author Mity1299
 *
 */
@Validated
@Controller
@RequestMapping(value="/user1")
public class UserControllerGroup1 {

    @Autowired
    UserBiz userBiz;
    

  
    
    @RequestMapping(value="/insertUserCorrect.do",method = RequestMethod.POST)
    public String insertUserCorrect(ModelMap map,
                             @Validated(value = {User1Group.class}) @ModelAttribute("user") User user,
                             BindingResult bindResult                                                   
                             ){

        int result =0;
        if(bindResult.hasErrors()) {
            return "user_test";
        }else {
            result =userBiz.insertUserCorrect(user);
            return "redirect:main";
        }
    }
    

}
