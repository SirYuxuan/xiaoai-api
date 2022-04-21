package com.yuxuan66.xiaoai.api.common.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Sir丶雨轩
 * @since 2022/4/21
 */
public class MiUtil {

    /**
     * 回复发言
     *
     * @param text 发言内容
     * @return 回复数据
     */
    public static JSONObject speak(String text, boolean... isEnd) {
        JSONObject result = new JSONObject();
        result.put("is_session_end", isEnd.length == 1 && isEnd[0]);
        result.put("version", "1.0");
        result.put("response", new JSONObject() {{
            put("confidence", 0.8869365);
            put("open_mic", true);
            put("to_speak", new JSONObject() {{
                put("type", 0);
                put("text", text);
            }});
        }});
        return result;
    }
}
