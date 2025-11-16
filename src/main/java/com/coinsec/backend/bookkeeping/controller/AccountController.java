package com.coinsec.backend.bookkeeping.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户资金账户表（受RLS保护，仅用户可见）- 已启用RLS 前端控制器
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@RestController
@RequestMapping("/api/bookkeeping/account")
@Tag(name = "用户资金账户表（受RLS保护，仅用户可见）- 已启用RLS", description = "用户资金账户表（受RLS保护，仅用户可见）- 已启用RLS")
public class AccountController {

}
