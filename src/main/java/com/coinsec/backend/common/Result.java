package com.coinsec.backend.common;

import com.coinsec.backend.common.enums.ErrorCode;
import lombok.Data;

/**
 * <p>
 * 统一返回结果类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Data
public class Result<T> {

    /**
     * 错误码
     */
    private int code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 错误提示
     */
    private String userTip;

    /**
     * 业务数据
     */
    private T data;

    // 私有构造方法
    private Result() {
    }

    /**
     * 成功返回结果
     *
     * @param data 业务数据
     * @return Result
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(ErrorCode.SUCCESS.getCode());
        result.setMsg(ErrorCode.SUCCESS.getMsg());
        result.setUserTip(ErrorCode.SUCCESS.getUserTip());
        result.setData(data);
        return result;
    }

    /**
     * 成功返回结果（无数据）
     *
     * @return Result
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     * @return Result
     */
    public static <T> Result<T> error(ErrorCode errorCode) {
        Result<T> result = new Result<>();
        result.setCode(errorCode.getCode());
        result.setMsg(errorCode.getMsg());
        result.setUserTip(errorCode.getUserTip());
        result.setData(null);
        return result;
    }

    /**
     * 失败返回结果（使用默认错误码）
     *
     * @param msg 错误信息
     * @return Result
     */
    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result<>();
        result.setCode(500);
        result.setMsg(msg);
        result.setUserTip(null);
        result.setData(null);
        return result;
    }
}
