/**
* 
* @author Mity1299
*/
package com.didispace.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import com.didispace.Application;

/**
 * @author Mity1299
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)//启动类
@WebAppConfiguration
public class HouseControllerTest {

    private MockHttpServletRequest request;//模拟用户请求
    private MockHttpServletResponse response;//模拟用户回应
    private MockMvc mvc;
    
    @Autowired
    protected WebApplicationContext wac;
    @Autowired
    private HouseController houseController;
    
    
    @Before
    public void setUp() throws Exception{
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    
    /**
     * 自定义数据校验测试，输入正确的情况
     */
    @Test
    public void testHouseInsertCor() {
       try {
        mvc.perform(post("/house/insert.do").
                   param("address", "Beijing").
                   param("phone", "13021131211").
                   param("email", "8080@qq.com")).
           andExpect(redirectedUrl("main"));
           //andDo(print());
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
    
}
