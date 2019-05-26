package com.didispace.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

import com.didispace.validator.group.User1Group;
import com.didispace.validator.group.User2Group;


public class User {

    private Long id;
    
    @NotEmpty(message = "用户名不能为空")
    private String name;
    
    @Min(value = 18 ,message = "年龄必须大于等于18",groups = {User1Group.class})
    @Max(value = 17 ,message = "年龄必须小于等于17",groups = {User2Group.class})
    private Integer age;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}