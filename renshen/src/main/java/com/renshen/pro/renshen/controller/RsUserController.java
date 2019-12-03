package com.renshen.pro.renshen.controller;

import com.renshen.pro.renshen.pojo.RsUser;
import com.renshen.pro.renshen.service.RsUserService;
import com.renshen.pro.renshen.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/* *
 * @ProjectName:    renshen
 * @Package:        com.renshen.pro.renshen.controller
 * @ClassName:      RsUserController
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/12/3
 * @Version:    1.0
 */
@RestController
@RequestMapping("user")
public class RsUserController {
    @Autowired
    private RsUserService rsUserService;

    @RequestMapping("getUser")
    public ResponseResult getUserById(Integer id) {
        RsUser userById = rsUserService.getUserById(id);
        Map<String, Object> map = new HashMap();
        map.put("user", userById);
        return new ResponseResult("200", map, "");
    }
}
