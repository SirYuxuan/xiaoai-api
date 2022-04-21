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
public class Session {

    private boolean is_new;
    private String session_id;
    private Application application;
    private User user;
    public void setIs_new(boolean is_new) {
         this.is_new = is_new;
     }
     public boolean getIs_new() {
         return is_new;
     }

    public void setSession_id(String session_id) {
         this.session_id = session_id;
     }
     public String getSession_id() {
         return session_id;
     }

    public void setApplication(Application application) {
         this.application = application;
     }
     public Application getApplication() {
         return application;
     }

    public void setUser(User user) {
         this.user = user;
     }
     public User getUser() {
         return user;
     }

}