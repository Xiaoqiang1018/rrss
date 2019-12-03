package com.renshen.pro.renshen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* *
 * @ProjectName:    renshen
 * @Package:        com.renshen.pro.renshen.controller
 * @ClassName:      TestController
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/12/3
 * @Version:    1.0
 */
@RestController
@RequestMapping("index")
public class TestController {

    @RequestMapping("web")
    public String welcome() {
        return "welcome to 人参小程序";
    }
}
