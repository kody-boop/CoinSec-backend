package com.coinsec.backend.sync.service.impl;

import com.coinsec.backend.sync.entity.SyncLog;
import com.coinsec.backend.sync.mapper.SyncLogMapper;
import com.coinsec.backend.sync.service.ISyncLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 多设备同步日志表（用于冲突排查和同步状态跟踪）- 已启用RLS 服务实现类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Service
public class SyncLogServiceImpl extends ServiceImpl<SyncLogMapper, SyncLog> implements ISyncLogService {

}
