package com.yuxuan66.xiaoai.api.rest;

import com.alibaba.fastjson.JSONObject;
import com.yuxuan66.xiaoai.api.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sir丶雨轩
 * @since 2022/4/21
 */
@RestController
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    /**
     * 处理小爱音箱的数据
     * @param data 数据
     * @return 返回数据
     */
    @PostMapping(path = "/api")
    public JSONObject api(@RequestBody JSONObject data){
        return apiService.doApi(data);
    }


}
