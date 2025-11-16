package com.coinsec.backend.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * 结果码枚举类
 * </p>
 * <p>
 * 第 1 位（错误类型）： <br>
 * 1xx：系统级错误（底层依赖、服务异常）<br>
 * 2xx：成功响应（仅 200 为通用成功）<br>
 * 4xx：客户端错误（参数、权限、请求方式等）<br>
 * 5xx：服务端业务错误（业务规则、数据状态等）<br>
 * </p>
 * <br>
 * <p>
 * 第 2 位（模块标识）：<br>
 * 0：通用模块（无具体业务归属）<br>
 * 1：用户认证模块（/api/v1/auth）<br>
 * 2：账本模块（/api/v1/book）<br>
 * 3：分类模块（/api/v1/category）<br>
 * 4：记账记录模块（/api/v1/record）<br>
 * 5：同步模块（/api/v1/sync）<br>
 * 6：模板模块（/api/v1/template）<br>
 * 7：统计模块（/api/v1/stat）<br>
 * 8：备份模块（/api/v1/backup）<br>
 * 9：用户信息模块（/api/v1/user）<br>
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {
    // ==================== 通用模块（0）====================
    SUCCESS(200, "操作成功", "操作成功", Module.COMMON),
    // 系统错误
    SYSTEM_DB_ERROR(1001, "数据库异常", "服务暂时不可用，请稍后重试", Module.COMMON),
    SYSTEM_CACHE_ERROR(1002, "缓存服务异常", "服务暂时不可用，请稍后重试", Module.COMMON),
    SYSTEM_THIRD_PARTY_ERROR(1003, "第三方服务异常", "第三方服务异常，请稍后重试", Module.COMMON),
    SYSTEM_ENCRYPT_ERROR(1004, "数据加密/解密失败", "数据处理异常，请稍后重试", Module.COMMON),
    // 客户端错误
    CLIENT_PARAM_FORMAT_ERROR(4001, "参数格式错误", "请填写完整必填信息，检查参数格式", Module.COMMON),
    CLIENT_PARAM_VALID_ERROR(4002, "参数校验失败", "参数格式不正确，请按要求填写", Module.COMMON),
    CLIENT_REQUEST_METHOD_ERROR(4003, "请求方式错误", "请求方式错误，请联系技术支持", Module.COMMON),
    CLIENT_REQUEST_FREQUENT_ERROR(4004, "请求频率过高", "请求过于频繁，请稍后重试", Module.COMMON),
    CLIENT_UNAUTHORIZED(4011, "未授权访问", "请先登录后操作", Module.COMMON),
    CLIENT_TOKEN_EXPIRED(4012, "登录状态已过期", "登录已过期，请重新登录", Module.COMMON),
    CLIENT_TOKEN_INVALID(4013, "令牌无效", "登录状态无效，请重新登录", Module.COMMON),
    CLIENT_FORBIDDEN(4031, "权限不足", "您无权限执行此操作", Module.COMMON),
    CLIENT_RESOURCE_NOT_FOUND(4041, "资源不存在", "操作的资源不存在或已被删除", Module.COMMON),
    CLIENT_API_NOT_FOUND(4042, "接口不存在", "请求的接口不存在，请联系技术支持", Module.COMMON),

    // 通用业务错误
    BUSINESS_STATUS_ERROR(5001, "业务状态异常", "业务处理异常，请稍后重试", Module.COMMON),
    BUSINESS_DATA_OCCUPIED(5002, "数据已被占用", "该数据已被占用，请更换后重试", Module.COMMON),

    // ==================== 用户认证模块（1）====================
    AUTH_EMAIL_EXIST(5101, "邮箱已被注册", "该邮箱已被注册，请直接登录或更换邮箱", Module.AUTH),
    AUTH_ACCOUNT_PASSWORD_ERROR(5102, "邮箱或密码错误", "邮箱或密码错误，请重新输入", Module.AUTH),
    AUTH_EMAIL_NOT_REGISTER(5103, "邮箱未注册", "该邮箱未注册，请先注册", Module.AUTH),
    AUTH_VERIFY_CODE_INVALID(5104, "验证码无效或已过期", "验证码无效或已过期，请重新获取", Module.AUTH),
    AUTH_VERIFY_CODE_FREQUENT(5105, "验证码发送过于频繁", "验证码发送过于频繁，请稍后重试", Module.AUTH),
    AUTH_PASSWORD_STRENGTH_ERROR(5106, "密码强度不足", "密码需8-20位，包含字母和数字", Module.AUTH),
    AUTH_PASSWORD_SAME_ERROR(5107, "新旧密码一致", "新密码不能与原密码一致，请更换", Module.AUTH),
    AUTH_ACCOUNT_STATUS_ERROR(5108, "账号状态异常", "账号状态异常，请联系客服", Module.AUTH),
    NOT_AUTHENTICATED(5109, "未认证用户", "请先登录后操作", Module.AUTH),
    AUTH_REGISTER_FAIL(5110, "注册失败", "注册失败，请稍后重试", Module.AUTH),
    AUTH_LOGIN_FAIL(5111, "登录失败", "登录失败，请稍后重试", Module.AUTH),

    // ==================== 账本模块（2）====================
    BOOK_NAME_EXIST(5201, "账本名称已存在", "该账本名称已存在，请更换名称", Module.BOOK),
    BOOK_DEFAULT_CANNOT_DELETE(5202, "默认账本不可删除", "默认账本不可删除，请先设置其他账本为默认", Module.BOOK),
    BOOK_COUNT_LIMIT(5203, "账本数量已达上限", "账本数量已达上限，无法创建更多", Module.BOOK),
    BOOK_HAS_DATA_CANNOT_DELETE(5204, "账本内存在数据，无法删除", "该账本下存在收支数据，请清空后再删除", Module.BOOK),
    BOOK_BUDGET_ILLEGAL(5205, "预算金额非法", "预算金额需为正数，且不超过合理范围", Module.BOOK),
    BOOK_CURRENCY_NOT_SUPPORT(5206, "货币类型不支持", "暂不支持该货币类型，请选择其他类型", Module.BOOK),

    // ==================== 分类模块（3）====================
    CATEGORY_NAME_EXIST(5301, "分类名称已存在", "该分类名称已存在，请更换名称", Module.CATEGORY),
    CATEGORY_HAS_CHILD_CANNOT_DELETE(5302, "存在子分类，无法删除", "该分类下存在子分类，请先删除子分类", Module.CATEGORY),
    CATEGORY_BE_USED_CANNOT_DELETE(5303, "分类已被使用，无法删除", "该分类已被收支记录使用，无法删除", Module.CATEGORY),
    CATEGORY_LEVEL_LIMIT(5304, "分类层级超出限制", "分类层级已达上限，无法创建更多层级", Module.CATEGORY),
    CATEGORY_PARENT_NOT_EXIST(5305, "父分类不存在", "父分类不存在，请选择有效分类", Module.CATEGORY),
    CATEGORY_TYPE_MISMATCH(5306, "分类类型不匹配", "子分类类型需与父分类一致，请调整", Module.CATEGORY),

    // ==================== 记账记录模块（4）====================
    RECORD_LOCAL_ID_EXIST(5401, "本地ID已存在", "数据同步冲突，请刷新后重试", Module.RECORD),
    RECORD_AMOUNT_ILLEGAL(5402, "金额非法", "金额需为正数，且不超过合理范围", Module.RECORD),
    RECORD_TIME_ILLEGAL(5403, "记账时间非法", "请选择合理的记账时间", Module.RECORD),
    RECORD_ENCRYPT_DATA_ERROR(5404, "加密数据格式错误", "数据格式错误，请重新提交", Module.RECORD),
    RECORD_CATEGORY_DELETED(5405, "分类已被删除", "该分类已被删除，请选择其他分类", Module.RECORD),
    RECORD_PAY_TYPE_NOT_SUPPORT(5406, "支付方式不支持", "暂不支持该支付方式，请选择其他方式", Module.RECORD),
    RECORD_HAS_DELETED(5407, "记录已被删除", "该收支记录已被删除，无法操作", Module.RECORD),

    // ==================== 同步模块（5）====================
    SYNC_VERSION_ABNORMAL(5501, "版本号异常", "数据版本异常，请重新同步", Module.SYNC),
    SYNC_DATA_CONFLICT(5502, "数据冲突", "数据同步冲突，请手动确认后重试", Module.SYNC),
    SYNC_DATA_EMPTY(5503, "同步数据为空", "无待同步数据", Module.SYNC),
    SYNC_DATA_FORMAT_ERROR(5504, "同步数据格式错误", "同步数据格式错误，请重新同步", Module.SYNC),
    SYNC_DEVICE_ID_INVALID(5505, "设备标识无效", "设备标识异常，请重启APP后重试", Module.SYNC),
    SYNC_DATA_TOO_MUCH(5506, "同步范围过大", "同步数据过多，请分批同步", Module.SYNC),
    SYNC_RECORD_NOT_EXIST(5507, "同步记录不存在", "部分同步数据已不存在，已跳过", Module.SYNC),

    // ==================== 模板模块（6）====================
    TEMPLATE_NAME_EXIST(5601, "模板名称已存在", "该模板名称已存在，请更换名称", Module.TEMPLATE),
    TEMPLATE_CATEGORY_NOT_EXIST(5602, "默认分类不存在", "默认分类不存在，请选择有效分类", Module.TEMPLATE),
    TEMPLATE_CONFIG_FORMAT_ERROR(5603, "字段配置格式错误", "模板配置格式错误，请重新设置", Module.TEMPLATE),
    TEMPLATE_CONFIG_ILLEGAL(5604, "字段配置非法", "模板字段配置非法，请检查后重试", Module.TEMPLATE),
    TEMPLATE_BE_USED_CANNOT_DELETE(5605, "模板已被使用，无法删除", "该模板已被使用，无法删除", Module.TEMPLATE),
    TEMPLATE_TYPE_MISMATCH(5606, "模板类型不匹配", "模板类型需与分类类型一致，请调整", Module.TEMPLATE),

    // ==================== 统计模块（7）====================
    STAT_TIME_RANGE_ILLEGAL(5701, "统计时间范围非法", "请选择合理的统计时间范围", Module.STAT),
    STAT_DIMENSION_NOT_SUPPORT(5702, "统计维度不支持", "暂不支持该统计维度，请选择其他维度", Module.STAT),
    STAT_NO_DATA(5703, "无统计数据", "该时间范围内无收支数据", Module.STAT),
    STAT_DATA_TOO_MUCH(5704, "统计数据量过大", "统计范围过大，请缩小范围后重试", Module.STAT),

    // ==================== 备份模块（8）====================
    BACKUP_FILE_FORMAT_ERROR(5801, "备份文件格式错误", "备份文件格式错误，请选择JSON/CSV文件", Module.BACKUP),
    BACKUP_FILE_PASSWORD_ERROR(5802, "备份文件密码错误", "备份文件密码错误，请重新输入", Module.BACKUP),
    BACKUP_FILE_DAMAGED(5803, "备份文件损坏", "备份文件已损坏，无法导入", Module.BACKUP),
    BACKUP_FILE_VERSION_INCOMPATIBLE(5804, "备份文件版本不兼容", "备份文件版本不兼容，请使用对应版本APP导入", Module.BACKUP),
    BACKUP_EXPORT_FAILED(5805, "导出备份失败", "备份导出失败，请稍后重试", Module.BACKUP),
    BACKUP_IMPORT_CONFLICT(5806, "导入数据冲突", "部分数据已存在，是否覆盖？", Module.BACKUP),
    BACKUP_IMPORT_TOO_MUCH(5807, "导入数据量超出限制", "导入数据过多，请拆分备份文件后重试", Module.BACKUP),

    // ==================== 用户信息模块（9）====================
    USER_EMAIL_BINDED(5901, "邮箱已被绑定", "该邮箱已被其他账号绑定，请更换邮箱", Module.USER),
    USER_OLD_PASSWORD_ERROR(5902, "原密码错误", "原密码错误，请重新输入", Module.USER),
    USER_AVATAR_URL_ERROR(5903, "头像URL格式错误", "头像地址无效，请重新上传", Module.USER),
    USER_NICKNAME_LENGTH_ERROR(5904, "昵称长度超出限制", "昵称长度不能超过30个字符，请修改", Module.USER),
    USER_INFO_UPDATE_FREQUENT(5905, "个人信息修改过于频繁", "信息修改过于频繁，请稍后重试", Module.USER);

    // ==================== 枚举核心字段 ====================
    /**
     * 错误码（4位数字）
     */
    private final int code;
    /**
     * 错误描述（技术层面，用于日志/开发排查）
     */
    private final String msg;
    /**
     * 用户提示（面向用户，友好提示）
     */
    private final String userTip;
    /**
     * 所属模块
     */
    private final Module module;

    /**
     * 根据错误码获取枚举实例（用于前端传码、数据库存码后反向解析）
     */
    public static ErrorCode getByCode(int code) {
        for (ErrorCode errorCode : values()) {
            if (errorCode.getCode() == code) {
                return errorCode;
            }
        }
        // 未知错误返回默认值
        return null;
    }

    // ==================== 枚举工具方法 ====================

    /**
     * 判断是否为系统错误（1xx开头）
     */
    public boolean isSystemError() {
        return String.valueOf(code).startsWith("1");
    }

    /**
     * 判断是否为客户端错误（4xx开头）
     */
    public boolean isClientError() {
        return String.valueOf(code).startsWith("4");
    }

    /**
     * 判断是否为业务错误（5xx开头）
     */
    public boolean isBusinessError() {
        return String.valueOf(code).startsWith("5");
    }

    // ==================== 模块枚举（内部静态类）====================
    @Getter
    public enum Module {
        COMMON("通用模块"),
        AUTH("用户认证模块"),
        BOOK("账本模块"),
        CATEGORY("分类模块"),
        RECORD("记账记录模块"),
        SYNC("同步模块"),
        TEMPLATE("模板模块"),
        STAT("统计模块"),
        BACKUP("备份模块"),
        USER("用户信息模块");

        private final String moduleName;

        Module(String moduleName) {
            this.moduleName = moduleName;
        }

    }
}
