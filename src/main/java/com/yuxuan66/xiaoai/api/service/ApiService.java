package com.yuxuan66.xiaoai.api.service;

import com.alibaba.fastjson.JSONObject;
import com.yuxuan66.xiaoai.api.common.utils.MiUtil;
import com.yuxuan66.xiaoai.api.entity.MiData;
import com.yuxuan66.xiaoai.api.intent.Action;
import com.yuxuan66.xiaoai.api.support.MiContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Sir丶雨轩
 * @since 2022/4/21
 */
@Slf4j
@Service
public class ApiService {

    private final MiContext miContext;

    public ApiService(MiContext miContext) {
        this.miContext = miContext;
    }

    /**
     * 处理小爱音箱的数据
     * @param data 数据
     * @return 返回数据
     */
    public JSONObject doApi(JSONObject data){
        MiData miData = data.toJavaObject(MiData.class);
        JSONObject slot = JSONObject.parseObject(miData.getRequest().getIntent().getSlots());
        String intentName = slot.getString("intent_name");
        Action action = miContext.getAction(intentName);
        if(action == null){
            log.info("Not Found IntentName: " + intentName);
            return MiUtil.speak("暂时无法理解您的意思");
        }
        return action.doAction(miData);
    }
}
