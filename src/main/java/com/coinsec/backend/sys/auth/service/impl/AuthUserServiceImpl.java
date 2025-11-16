package com.coinsec.backend.sys.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coinsec.backend.sys.auth.entity.SysUser;
import com.coinsec.backend.sys.auth.mapper.SysUserMapper;
import com.coinsec.backend.sys.auth.service.ISysUserService;
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
public class AuthUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
