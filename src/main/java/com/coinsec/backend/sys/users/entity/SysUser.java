package com.coinsec.backend.sys.users.entity;

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
 * 用户基础信息及认证核心表
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Getter
@Setter
@ToString
@TableName("sys_user")
@Accessors(chain = true)
public class SysUser implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID（主键，自增）
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户密码哈希（PBKDF2加密，加盐迭代10万次）
     */
    @TableField("password_hash")
    private String passwordHash;

    /**
     * 用户邮箱（唯一，用于登录和密码找回）
     */
    @TableField("email")
    private String email;

    /**
     * 用户显示昵称（非唯一，前端展示）
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 用户主密钥哈希（SHA-256，用于主密钥验证）
     */
    @TableField("user_key_hash")
    private String userKeyHash;

    /**
     * 账号状态：1-正常，0-禁用
     */
    @TableField("status")
    private Short status;

    /**
     * 最后登录时间
     */
    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    /**
     * 账号创建时间（自动填充）
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 账号信息更新时间（自动维护）
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
