package com.coinsec.backend.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;

import static com.coinsec.backend.common.constant.PasswordConstant.*;

/**
 * <p>
 * 密码验证工具类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public class PasswordValidator {
    // 常见弱密码列表
    private static final String[] COMMON_WEAK_PASSWORDS = {
            "123456", "123456789", "12345678", "12345", "password",
            "123123", "111111", "qwerty", "admin", "root"
    };

    /**
     * 校验密码是否符合规定
     *
     * @param password 待校验密码
     * @return true-符合规定，false-不符合规定
     */
    public static boolean isValidPassword(String password) {
        // 检查密码是否为空
        if (StringUtils.isBlank(password)) {
            return false;
        }

        // 检查长度
        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            return false;
        }

        // 检查是否为常见弱密码
        for (String weakPassword : COMMON_WEAK_PASSWORDS) {
            if (weakPassword.equals(password)) {
                return false;
            }
        }

        // 检查复杂度（至少包含两种字符类型）
        Matcher matcher = PASSWORD_PATTERN.matcher(password);
        return matcher.matches();
    }
}
