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
public class MiData {

    private Request request;
    private Session session;
    private String query;
    private Context context;
    private String version;
    public void setRequest(Request request) {
         this.request = request;
     }
     public Request getRequest() {
         return request;
     }

    public void setSession(Session session) {
         this.session = session;
     }
     public Session getSession() {
         return session;
     }

    public void setQuery(String query) {
         this.query = query;
     }
     public String getQuery() {
         return query;
     }

    public void setContext(Context context) {
         this.context = context;
     }
     public Context getContext() {
         return context;
     }

    public void setVersion(String version) {
         this.version = version;
     }
     public String getVersion() {
         return version;
     }

}