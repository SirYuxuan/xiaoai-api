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
public class Context {

    private String device_id;
    private String user_agent;
    private String device_category;
    private boolean in_exp;
    public void setDevice_id(String device_id) {
         this.device_id = device_id;
     }
     public String getDevice_id() {
         return device_id;
     }

    public void setUser_agent(String user_agent) {
         this.user_agent = user_agent;
     }
     public String getUser_agent() {
         return user_agent;
     }

    public void setDevice_category(String device_category) {
         this.device_category = device_category;
     }
     public String getDevice_category() {
         return device_category;
     }

    public void setIn_exp(boolean in_exp) {
         this.in_exp = in_exp;
     }
     public boolean getIn_exp() {
         return in_exp;
     }

}