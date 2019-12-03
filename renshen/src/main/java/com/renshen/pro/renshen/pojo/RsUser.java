package com.renshen.pro.renshen.pojo;

/* *
 * @ProjectName:    renshen
 * @Package:        com.renshen.pro.renshen.pojo
 * @ClassName:      RsUser
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/12/3
 * @Version:    1.0
 */
public class RsUser {
    private Integer id;
    private String username;
    private int sex;
    private int age;
    private String headphotos;
    private String email;
    private String address;
    private String phone;
    private int category;
    private String weixin;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeadphotos() {
        return headphotos;
    }

    public void setHeadphotos(String headphotos) {
        this.headphotos = headphotos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
