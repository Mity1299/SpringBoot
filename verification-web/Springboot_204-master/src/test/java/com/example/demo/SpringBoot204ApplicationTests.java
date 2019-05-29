package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot204ApplicationTests {

    private MockMvc mvc;
    
    @Autowired
    protected WebApplicationContext wac;
    @Autowired
    private HomeController homeController;
    
    
    @Before
    public void setUp() throws Exception{

        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    
    @Ignore
    public void testVerlidation() {
        try {
            mvc.perform(post("/carform").
                        param("name", "1").
                        param("type", "1")).
                andDo(print());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @Test
    public void testPath() {
        try {
            mvc.perform(post("/carform").
                        param("name", "1111111").
                        param("type", "1111111").
                        param("description", "11111")).
                andDo(print());
                //andExpect(forwardedUrl("carconfirm"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
    

}
