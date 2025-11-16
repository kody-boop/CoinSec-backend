package com.coinsec.backend.sync.service;

import com.coinsec.backend.sync.entity.SyncLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 多设备同步日志表（用于冲突排查和同步状态跟踪）- 已启用RLS 服务类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public interface ISyncLogService extends IService<SyncLog> {

}
