package com.coinsec.backend.common.constant;

import java.util.regex.Pattern;

/**
 * <p>
 * 密码常量类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public class PasswordConstant {

    // 密码加密的次数
    public static final int GESTALT_DEFAULT_LOG2_ROUNDS = 12;
    // 密码长度
    public static final int MIN_LENGTH = 8;
    public static final int MAX_LENGTH = 20;
    // 密码正则
    public static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)|(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9])|(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,20}$");

    private PasswordConstant() {
    }
}
