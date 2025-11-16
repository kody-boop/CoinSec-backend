package com.coinsec.backend.bookkeeping.service;

import com.coinsec.backend.bookkeeping.entity.AccountTransactionsCategory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 收支分类表（支持多级分类，受RLS保护）- 已启用RLS 服务类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public interface IAccountTransactionsCategoryService extends IService<AccountTransactionsCategory> {

}
