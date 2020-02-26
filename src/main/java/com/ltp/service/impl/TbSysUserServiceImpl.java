package com.ltp.service.impl;

import com.ltp.mapper.TbSysUserMapper;
import com.ltp.model.TbSysUser;
import com.ltp.service.TbSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: SSM
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/2/26 16:30
 */
@Service
class TbSysUserServiceImpl implements TbSysUserService {
    @Autowired
    private TbSysUserMapper tbSysUserMapper;


    @Override
    public TbSysUser queryById(String id) {
        return tbSysUserMapper.selectByPrimaryKey(id);
    }
}
