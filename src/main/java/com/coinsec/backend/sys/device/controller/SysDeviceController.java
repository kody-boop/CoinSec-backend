package com.coinsec.backend.sys.device.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户授权登录设备管理表（支持多设备同步和远程注销） 前端控制器
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@RestController
@RequestMapping("/api/sys/users/device")
@Tag(name = "用户授权登录设备管理表", description = "用户授权登录设备管理表（支持多设备同步和远程注销）")
public class SysDeviceController {

}
