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
 * 收支分类表（支持多级分类，受RLS保护）- 已启用RLS
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("account_transactions_category")
public class AccountTransactionsCategory implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 分类ID（主键，自增）
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关联用户ID（用户删除时级联删除）
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 分类名称（用户自定义，明文存储）
     */
    @TableField("name")
    private String name;

    /**
     * 分类类型：income(收入)/expense(支出)
     */
    @TableField("category_type")
    private String categoryType;

    /**
     * 父分类ID（null为一级分类，支持多级）
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 分类图标标识（前端UI展示用）
     */
    @TableField("icon")
    private String icon;

    /**
     * 分类颜色标识（前端UI展示用）
     */
    @TableField("color")
    private String color;

    /**
     * 前端展示排序序号（数值越小越靠前）
     */
    @TableField("sort_order")
    private Integer sortOrder;

    /**
     * 分类创建时间（自动填充）
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 分类信息更新时间（自动维护）
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
