package com.coinsec.backend.bookkeeping.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 收支分类表（支持多级分类，受RLS保护）- 已启用RLS 前端控制器
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@RestController
@RequestMapping("/api/bookkeeping/category")
@Tag(name = "AccountTransactionsCategoryController", description = "收支分类表（支持多级分类，受RLS保护）- 已启用RLS 前端控制器")
public class AccountTransactionsCategoryController {

}
