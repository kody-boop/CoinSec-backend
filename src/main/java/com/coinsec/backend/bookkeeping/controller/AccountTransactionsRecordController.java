package com.coinsec.backend.bookkeeping.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 核心交易记录表（所有收支/转账明细，受RLS保护）- 已启用RLS 前端控制器
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@RestController
@RequestMapping("/api/bookkeeping/transactions")
@Tag(name = "核心交易记录表（所有收支/转账明细，受RLS保护）- 已启用RLS", description = "核心交易记录表（所有收支/转账明细，受RLS保护）- 已启用RLS")
public class AccountTransactionsRecordController {

}
