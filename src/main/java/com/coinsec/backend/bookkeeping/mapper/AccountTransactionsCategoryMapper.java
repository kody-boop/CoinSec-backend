package com.coinsec.backend.bookkeeping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coinsec.backend.bookkeeping.entity.AccountTransactionsCategory;

/**
 * <p>
 * 收支分类表（支持多级分类，受RLS保护）- 已启用RLS Mapper 接口
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public interface AccountTransactionsCategoryMapper extends BaseMapper<AccountTransactionsCategory> {

}
