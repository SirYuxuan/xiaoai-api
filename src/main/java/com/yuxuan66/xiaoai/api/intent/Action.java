package com.yuxuan66.xiaoai.api.intent;

import com.alibaba.fastjson.JSONObject;
import com.yuxuan66.xiaoai.api.entity.MiData;

/**
 * @author Sir丶雨轩
 * @since 2022/4/21
 */
public interface Action {

    /**
     * 返回数据
     * @return 数据
     */
    JSONObject doAction(MiData data);
}
