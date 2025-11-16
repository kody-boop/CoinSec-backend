package com.coinsec.backend.sys.users.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coinsec.backend.sys.users.entity.SysUser;
import com.coinsec.backend.sys.users.mapper.UserManagementMapper;
import com.coinsec.backend.sys.users.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基础信息及认证核心表 服务实现类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<UserManagementMapper, SysUser> implements ISysUserService {

}
