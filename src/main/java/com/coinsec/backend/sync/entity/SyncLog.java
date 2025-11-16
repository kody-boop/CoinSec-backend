package com.coinsec.backend.sync.entity;

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
 * 多设备同步日志表（用于冲突排查和同步状态跟踪）- 已启用RLS
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Getter
@Setter
@ToString
@TableName("sync_log")
@Accessors(chain = true)
public class SyncLog implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 日志ID（主键，自增）
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关联用户ID（用户删除时级联删除）
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 执行同步的设备ID（关联sys_device表）
     */
    @TableField("device_id")
    private String deviceId;

    /**
     * 同步类型：full(全量同步)/incremental(增量同步)
     */
    @TableField("sync_type")
    private String syncType;

    /**
     * 同步开始时间
     */
    @TableField("sync_start_time")
    private LocalDateTime syncStartTime;

    /**
     * 同步结束时间（成功/失败时填充）
     */
    @TableField("sync_end_time")
    private LocalDateTime syncEndTime;

    /**
     * 同步记录总数（成功时统计）
     */
    @TableField("record_count")
    private Integer recordCount;

    /**
     * 同步状态：0-进行中，1-成功，2-失败
     */
    @TableField("status")
    private Short status;

    /**
     * 同步失败错误信息（含冲突数据ID、异常堆栈）
     */
    @TableField("error_msg")
    private String errorMsg;

    /**
     * 日志创建时间（自动填充）
     */
    @TableField("created_at")
    private LocalDateTime createdAt;
}
