package com.coinsec.backend.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.Type;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * swagger2 配置类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenApi() {
        String securitySchemeName = "bearerAuth";

        return new OpenAPI()
                .info(new Info()
                        .title("CoinSec API")
                        .version("1.0.0")
                        .description("CoinSec API 接口文档")
                        .contact(new Contact()
                                .name("kody")
                                .email("zhaojiew.wang@gmail.com"))
                        .license(new License()
                                .name("MTI")
                                .url("https://opensource.org/license/mit")))
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes(securitySchemeName,
                                new SecurityScheme()
                                        .name(securitySchemeName)
                                        .type(Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .addServersItem(new Server()
                        .url("http://localhost:8080")
                        .description("开发环境"))
                .addServersItem(new Server()
                        .url("https://api.example.com")
                        .description("生产环境"));
    }
}
