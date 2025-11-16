package com.coinsec.backend.sync.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coinsec.backend.sync.entity.SyncLog;

/**
 * <p>
 * 多设备同步日志表（用于冲突排查和同步状态跟踪）- 已启用RLS Mapper 接口
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public interface SyncLogMapper extends BaseMapper<SyncLog> {

}
