package com.didispace.entity;

import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;


public class House {
    
    @Null
    private Integer id;

    @Size(min = 1,max = 10)
    private String address;
    

    private String phone;
    
    @Email
    private String email;


    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.id
     *
     * @param id the value for house.id
     *
     * @mbg.generated Tue May 21 15:12:45 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.address
     *
     * @return the value of house.address
     *
     * @mbg.generated Tue May 21 15:12:45 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.address
     *
     * @param address the value for house.address
     *
     * @mbg.generated Tue May 21 15:12:45 CST 2019
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.phone
     *
     * @return the value of house.phone
     *
     * @mbg.generated Tue May 21 15:12:45 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.phone
     *
     * @param phone the value for house.phone
     *
     * @mbg.generated Tue May 21 15:12:45 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.email
     *
     * @return the value of house.email
     *
     * @mbg.generated Tue May 21 15:12:45 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.email
     *
     * @param email the value for house.email
     *
     * @mbg.generated Tue May 21 15:12:45 CST 2019
     */
    public void setEmail(String email) {
        this.email = email;
    }
}