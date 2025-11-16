package com.coinsec.backend.sync.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 多设备同步日志表（用于冲突排查和同步状态跟踪）- 已启用RLS 前端控制器
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@RestController
@RequestMapping("/api/sync")
@Tag(name = "多设备同步日志表", description = "多设备同步日志表（用于冲突排查和同步状态跟踪）")
public class SyncLogController {

}
