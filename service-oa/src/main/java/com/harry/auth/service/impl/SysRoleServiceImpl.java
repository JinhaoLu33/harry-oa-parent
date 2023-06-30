package com.harry.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.harry.auth.mapper.SysRoleMapper;
import com.harry.auth.service.SysRoleService;
import com.harry.model.system.SysRole;
import com.harry.vo.system.AssignRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    //search all roles and current user role
    @Override
    public Map<String, Object> findRoleDataByUserId(Long userId) {
        return null;
    }
    //assign user a role
    @Override
    public void doAssign(AssignRoleVo assignRoleVo) {

    }

}
