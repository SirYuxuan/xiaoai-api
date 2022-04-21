package com.yuxuan66.xiaoai.api.intent.midefault;

import com.alibaba.fastjson.JSONObject;
import com.yuxuan66.xiaoai.api.common.utils.MiUtil;
import com.yuxuan66.xiaoai.api.entity.MiData;
import com.yuxuan66.xiaoai.api.intent.Action;
import com.yuxuan66.xiaoai.api.intent.annotation.IntentAction;

/**
 * @author Sir丶雨轩
 * @since 2022/4/21
 */
@IntentAction(name = "Mi_Welcome")
public class StartAction implements Action {

    @Override
    public JSONObject doAction(MiData data) {
        return MiUtil.speak("欢迎使用雨轩智能");
    }

}
