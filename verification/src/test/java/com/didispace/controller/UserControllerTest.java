/**
* 
* @author Mity1299
*/
package com.didispace.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import com.didispace.entity.User;
import com.didispace.Application;

/**
 * @author Mity1299
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)//启动类
@WebAppConfiguration
public class UserControllerTest {
    
    private MockHttpServletRequest request;//模拟用户请求
    private MockHttpServletResponse response;//模拟用户回应
    private MockMvc mvc;
    
    @Autowired
    protected WebApplicationContext wac;

    
    
    @Before
    public void setUp() throws Exception{
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    

    
    /**
     * 分组校验，User1Group.class
     * 年龄必须大于等于18
     * 可以成功插入数据
     */
    @Test
    public void testInsertUserPathLegal() {
        try {
            mvc.perform(post("/user1/insertUserCorrect.do").
                    param("name", "monika").
                    param("age", "18")).
                    andExpect(redirectedUrl("main"));
                    //andDo(print());
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    /**
     * 分组校验，User1Group.class
     * 年龄必须小于等于17
     * 不能成功插入数据
     */
    @Test
    public void testInsertUser2PathLegal() {
        try {
            mvc.perform(post("/user2/insertUserCorrect.do").
                    param("name", "monika").
                    param("age", "18")).
                    andExpect(status().is(200));
                    //andDo(print());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
