package com.ltp.mapper;

import com.ltp.model.TbSysUser;


/** 
* @ProjectName: SSM
* @Description: TODO
* @Author: Ltp
* @Date: 2020/2/26 16:29
*/
public interface TbSysUserMapper {
    int deleteByPrimaryKey(String userCode);

    int insert(TbSysUser record);

    int insertSelective(TbSysUser record);

    TbSysUser selectByPrimaryKey(String userCode);

    int updateByPrimaryKeySelective(TbSysUser record);

    int updateByPrimaryKey(TbSysUser record);
}