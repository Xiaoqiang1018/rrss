package com.renshen.pro.renshen.utils;

import java.util.Map;

/* *
 * @ProjectName:    renshen
 * @Package:        com.renshen.pro.renshen.utils
 * @ClassName:      ResponseResult
 * @Author:     xiaoqiang
 * @Description:  响应类
 * @Date:    2019/12/3
 * @Version:    1.0
 */
public class ResponseResult {
    //响应码
    String code;
    //响应数据
    Map<String, Object> data;
    //其他
    String other;

    public ResponseResult() {
    }

    public ResponseResult(String code, Map<String, Object> data, String other) {
        this.code = code;
        this.data = data;
        this.other = other;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
