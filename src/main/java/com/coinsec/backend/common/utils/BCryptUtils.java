package com.coinsec.backend.common.utils;

import cn.hutool.crypto.digest.BCrypt;

import static com.coinsec.backend.common.constant.PasswordConstant.GESTALT_DEFAULT_LOG2_ROUNDS;

/**
 * <p>
 * BCrypt 工具类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public class BCryptUtils {
    /**
     * 获取盐
     *
     * @return 盐
     */
    public static String getSalt() {
        return BCrypt.gensalt(GESTALT_DEFAULT_LOG2_ROUNDS);
    }

    /**
     * 加密
     *
     * @param password 密码
     * @return 加密后的密码
     */
    public static String encryption(String password) {
        String salt = getSalt();
        return BCrypt.hashpw(password, salt);
    }


    /**
     * 校验
     *
     * @param password 密码
     * @param hash     密码密文
     * @return 校验结果
     */
    public static boolean verify(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}
