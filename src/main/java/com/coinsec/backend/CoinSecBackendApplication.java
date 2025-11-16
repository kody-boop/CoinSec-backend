package com.coinsec.backend;

import cn.dev33.satoken.SaManager;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CoinSecBackendApplication is the entry point of the application.
 *
 * @author kody
 * @since 2025-11-16
 */
@Log4j2
@SpringBootApplication
@MapperScan("com.coinsec.backend.**.mapper")
public class CoinSecBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinSecBackendApplication.class, args);
        log.info("启动成功，Sa-Token 配置如下： {}", SaManager.getConfig());
    }

}
