package com.coinsec.backend.bookkeeping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 核心交易记录表（所有收支/转账明细，受RLS保护）- 已启用RLS
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("account_transactions_record")
public class AccountTransactionsRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交易记录ID（主键，自增）
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关联用户ID（用户删除时级联删除）
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 交易账户ID（资金变动账户）
     */
    @TableField("account_id")
    private Long accountId;

    /**
     * 关联分类ID（分类删除时设为null）
     */
    @TableField("category_id")
    private Long categoryId;

    /**
     * 交易类型：income(收入)/expense(支出)/transfer(转账)
     */
    @TableField("transaction_type")
    private String transactionType;

    /**
     * 交易时间（明文存储，用于查询统计）
     */
    @TableField("transaction_time")
    private LocalDateTime transactionTime;

    /**
     * 交易金额（AES-256-GCM加密，含正负标识）
     */
    @TableField("amount_encrypted")
    private String amountEncrypted;

    /**
     * 敏感扩展数据（加密存储）：{"remark":"午餐","tags":["外卖"],"merchant":"美团"}
     */
    @TableField("encrypted_data")
    private Object encryptedData;

    /**
     * 转账关联账户ID（仅transfer类型有效）
     */
    @TableField("related_account_id")
    private Long relatedAccountId;

    /**
     * 交易状态：1-正常，0-已删除（逻辑删除）
     */
    @TableField("status")
    private Short status;

    /**
     * 同步状态：0-待同步，1-已同步
     */
    @TableField("sync_status")
    private Short syncStatus;

    /**
     * 创建记录的设备ID（关联sys_device表）
     */
    @TableField("device_id")
    private String deviceId;

    /**
     * 版本号（乐观锁，解决同步冲突）
     */
    @TableField("version")
    private Integer version;

    /**
     * 记录创建时间（自动填充）
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 记录更新时间（自动维护）
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
