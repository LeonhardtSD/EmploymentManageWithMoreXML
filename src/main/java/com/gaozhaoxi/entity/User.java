package com.gaozhaoxi.entity;

/**
 * @author Leon
 */
public class User {
    private Integer id;
    private String loginname;
    private String loginpassword;
    private String username;
    private String phone;
    private String address;

    public User(){

    }

    public User(Integer id,String loginname,String loginpassword,String username,String phone,String address){
        this.id=id;
        this.loginname=loginname;
        this.loginpassword=loginpassword;
        this.username=username;
        this.phone=phone;
        this.address=address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String s="User=id:"+id+",loginname:"+loginname+",loginpassword:"+loginpassword+
                ",username:"+username+",phone:"+phone+",address:"+address;
        return super.toString()+"\n"+s;
    }
}
