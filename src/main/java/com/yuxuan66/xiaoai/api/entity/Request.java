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
public class Request {

    private int type;
    private String request_id;
    private long timestamp;
    private Intent intent;
    private String locale;
    private Slot_info slot_info;
    private boolean is_monitor;
    public void setType(int type) {
         this.type = type;
     }
     public int getType() {
         return type;
     }

    public void setRequest_id(String request_id) {
         this.request_id = request_id;
     }
     public String getRequest_id() {
         return request_id;
     }

    public void setTimestamp(long timestamp) {
         this.timestamp = timestamp;
     }
     public long getTimestamp() {
         return timestamp;
     }

    public void setIntent(Intent intent) {
         this.intent = intent;
     }
     public Intent getIntent() {
         return intent;
     }

    public void setLocale(String locale) {
         this.locale = locale;
     }
     public String getLocale() {
         return locale;
     }

    public void setSlot_info(Slot_info slot_info) {
         this.slot_info = slot_info;
     }
     public Slot_info getSlot_info() {
         return slot_info;
     }

    public void setIs_monitor(boolean is_monitor) {
         this.is_monitor = is_monitor;
     }
     public boolean getIs_monitor() {
         return is_monitor;
     }

}