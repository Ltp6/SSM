package com.ltp.controller;

import com.alibaba.fastjson.JSON;
import com.ltp.model.TbSysUser;
import com.ltp.service.TbSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: SSM
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/2/26 16:33
 */
@Controller
public class TbSysUserController {
    @Autowired
    private TbSysUserService tbSysUserService;
    @RequestMapping(value = "/user.action")
    @ResponseBody
    public String queryById(String id) {
        TbSysUser tbSysUser = tbSysUserService.queryById(id);
        return JSON.toJSONString(tbSysUser);
    }
}
