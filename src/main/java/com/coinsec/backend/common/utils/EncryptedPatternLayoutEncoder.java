package com.coinsec.backend.common.utils;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import cn.hutool.crypto.SecureUtil;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import java.nio.charset.StandardCharsets;

/**
 * <p>
 *
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Setter
public class EncryptedPatternLayoutEncoder extends PatternLayoutEncoder {
    // 加密密钥（建议从配置文件读取，不要硬编码）
    @Value("${log-key}")
    private String secretKey;

    @Override
    public byte[] encode(ILoggingEvent event) {
        // 1. 先通过父类获取原始日志字符串
        String originalLog = new String(super.encode(event), StandardCharsets.UTF_8);
        // 2. 实现加密逻辑（示例：简单AES加密，实际需用安全的加密算法）
        String encryptedLog = encrypt(originalLog, secretKey);
        // 3. 返回加密后的字节数组
        return encryptedLog.getBytes(StandardCharsets.UTF_8);
    }

    // 加密工具方法（需实现真实加密逻辑）
    private String encrypt(String content, String key) {
        return SecureUtil.aes(key.getBytes()).encryptBase64(content);
    }
}
