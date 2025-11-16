package com.coinsec.backend.bookkeeping.entity;

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
 * 用户资金账户表（受RLS保护，仅用户可见）- 已启用RLS
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Getter
@Setter
@ToString
@TableName("account")
@Accessors(chain = true)
public class Account implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 账户ID（主键，自增）
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关联用户ID（用户删除时级联删除）
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 账户名称（用户自定义，明文存储）
     */
    @TableField("name")
    private String name;

    /**
     * 账户类型：cash(现金)/bank(银行卡)/alipay(支付宝)/wechat(微信)/other(其他)
     */
    @TableField("account_type")
    private String accountType;

    /**
     * 账户图标标识（前端UI展示用）
     */
    @TableField("icon")
    private String icon;

    /**
     * 账户颜色标识（前端UI展示用）
     */
    @TableField("color")
    private String color;

    /**
     * 初始余额（AES-256-GCM加密存储，含货币单位）
     */
    @TableField("initial_balance_encrypted")
    private String initialBalanceEncrypted;

    /**
     * 账户状态：1-正常，0-已注销
     */
    @TableField("status")
    private Short status;

    /**
     * 前端展示排序序号（数值越小越靠前）
     */
    @TableField("sort_order")
    private Integer sortOrder;

    /**
     * 账户创建时间（自动填充）
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 账户信息更新时间（自动维护）
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
