package com.renshen.pro.renshen.dao;

import com.renshen.pro.renshen.pojo.RsUser;
import org.apache.ibatis.annotations.Mapper;

/* *
 * @ProjectName:    renshen
 * @Package:        com.renshen.pro.renshen.dao
 * @ClassName:      RsUserDao
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/12/3
 * @Version:    1.0
 */
@Mapper
public interface RsUserDao {

    /* *
     * 功能描述: <br>
     *     查询用户信息
     * 〈〉
     * @Param:
     * @Return:
     * @Author: xiaoqiang
     * @Date: 2019/12/3
     */
    RsUser getUserById(Integer id);

}
