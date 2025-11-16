package com.coinsec.backend.sys.device.service.impl;

import com.coinsec.backend.sys.device.entity.SysDevice;
import com.coinsec.backend.sys.device.mapper.SysDeviceMapper;
import com.coinsec.backend.sys.device.service.ISysDeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户授权登录设备管理表（支持多设备同步和远程注销） 服务实现类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Service
public class SysDeviceServiceImpl extends ServiceImpl<SysDeviceMapper, SysDevice> implements ISysDeviceService {

}
