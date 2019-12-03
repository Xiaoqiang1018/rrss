package com.renshen.pro.renshen.service.impl;

import com.renshen.pro.renshen.dao.RsUserDao;
import com.renshen.pro.renshen.pojo.RsUser;
import com.renshen.pro.renshen.service.RsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* *
 * @ProjectName:    renshen
 * @Package:        com.renshen.pro.renshen.service.impl
 * @ClassName:      RsUserServiceImpl
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/12/3
 * @Version:    1.0
 */
@Service
public class RsUserServiceImpl implements RsUserService {
    @Autowired
    private RsUserDao rsUserDao;

    @Override
    public RsUser getUserById(Integer id) {
        return rsUserDao.getUserById(id);
    }
}
