package com.myk.controller;

import com.alibaba.fastjson.JSONObject;
import com.myk.dao.entity.UseInfo;
import com.myk.service.UseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/11/17 0017.
 */

@RestController
public class UseInfoController {

    @Autowired
    private UseInfoService useInfoService;

    @RequestMapping(value = "/getUser", method = { RequestMethod.GET, RequestMethod.POST }, produces = {
            "application/json;charset=UTF-8" })
    public String getUser(@RequestParam("id") Integer id){
        UseInfo useInfo = useInfoService.getUseInfo(id);
        return JSONObject.toJSONString(useInfo);
    }
}
