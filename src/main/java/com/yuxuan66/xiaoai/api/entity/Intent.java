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
public class Intent {

    private String query;
    private int score;
    private boolean complete;
    private String domain;
    private int confidence;
    private String skillType;
    private String sub_domain;
    private String app_id;
    private String request_type;
    private boolean need_fetch_token;
    private boolean is_direct_wakeup;
    private String slots;
    private boolean is_qc;
    private String recall_method;
    public void setQuery(String query) {
         this.query = query;
     }
     public String getQuery() {
         return query;
     }

    public void setScore(int score) {
         this.score = score;
     }
     public int getScore() {
         return score;
     }

    public void setComplete(boolean complete) {
         this.complete = complete;
     }
     public boolean getComplete() {
         return complete;
     }

    public void setDomain(String domain) {
         this.domain = domain;
     }
     public String getDomain() {
         return domain;
     }

    public void setConfidence(int confidence) {
         this.confidence = confidence;
     }
     public int getConfidence() {
         return confidence;
     }

    public void setSkillType(String skillType) {
         this.skillType = skillType;
     }
     public String getSkillType() {
         return skillType;
     }

    public void setSub_domain(String sub_domain) {
         this.sub_domain = sub_domain;
     }
     public String getSub_domain() {
         return sub_domain;
     }

    public void setApp_id(String app_id) {
         this.app_id = app_id;
     }
     public String getApp_id() {
         return app_id;
     }

    public void setRequest_type(String request_type) {
         this.request_type = request_type;
     }
     public String getRequest_type() {
         return request_type;
     }

    public void setNeed_fetch_token(boolean need_fetch_token) {
         this.need_fetch_token = need_fetch_token;
     }
     public boolean getNeed_fetch_token() {
         return need_fetch_token;
     }

    public void setIs_direct_wakeup(boolean is_direct_wakeup) {
         this.is_direct_wakeup = is_direct_wakeup;
     }
     public boolean getIs_direct_wakeup() {
         return is_direct_wakeup;
     }

    public void setSlots(String slots) {
         this.slots = slots;
     }
     public String getSlots() {
         return slots;
     }

    public void setIs_qc(boolean is_qc) {
         this.is_qc = is_qc;
     }
     public boolean getIs_qc() {
         return is_qc;
     }

    public void setRecall_method(String recall_method) {
         this.recall_method = recall_method;
     }
     public String getRecall_method() {
         return recall_method;
     }

}