package com.yuxuan66.xiaoai.api.support;

import cn.hutool.extra.spring.SpringUtil;
import com.yuxuan66.xiaoai.api.intent.Action;
import com.yuxuan66.xiaoai.api.intent.annotation.IntentAction;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sir丶雨轩
 * @since 2022/4/21
 */
@Component
public class MiContext {

    private Map<String,Action> actionMapping = new HashMap<>();

    /**
     * 获取要执行的bean
     * @param name 名称
     * @return bean
     */
    public Action getAction(String name){
        return actionMapping.get(name);
    }

    @PostConstruct
    public void initAction(){

        SpringUtil.getApplicationContext().getBeansOfType(Action.class).forEach((name,bean)->{
            String actionName = bean.getClass().getAnnotation(IntentAction.class).name();
            actionMapping.put(actionName,bean);
        });

    }
}
