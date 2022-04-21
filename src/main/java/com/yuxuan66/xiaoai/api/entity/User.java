/**
  * Copyright 2022 bejson.com 
  */
package com.yuxuan66.xiaoai.api.entity;

/**
 * Auto-generated: 2022-04-21 9:55:27
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class User {

    private String user_id;
    private boolean is_user_login;
    private String gender;
    public void setUser_id(String user_id) {
         this.user_id = user_id;
     }
     public String getUser_id() {
         return user_id;
     }

    public void setIs_user_login(boolean is_user_login) {
         this.is_user_login = is_user_login;
     }
     public boolean getIs_user_login() {
         return is_user_login;
     }

    public void setGender(String gender) {
         this.gender = gender;
     }
     public String getGender() {
         return gender;
     }

}