package com.coinsec.backend.sys.device.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户授权登录设备管理表（支持多设备同步和远程注销）
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("sys_device")
public class SysDevice implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 设备记录ID（主键，自增）
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关联用户ID（用户删除时级联删除）
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 设备唯一标识（客户端生成，设备指纹+UUID）
     */
    @TableField("device_id")
    private String deviceId;

    /**
     * 设备名称（前端展示）
     */
    @TableField("device_name")
    private String deviceName;

    /**
     * 设备类型：ios/android/windows/mac/linux/web
     */
    @TableField("device_type")
    private String deviceType;

    /**
     * 设备最后活跃时间
     */
    @TableField("last_active_time")
    private LocalDateTime lastActiveTime;

    /**
     * 设备有效性：true-有效，false-已注销
     */
    @TableField("is_valid")
    private Boolean isValid;

    /**
     * 设备注册时间（自动填充）
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 设备信息更新时间（自动维护）
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
