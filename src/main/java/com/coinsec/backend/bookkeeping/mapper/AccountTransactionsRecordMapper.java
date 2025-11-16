package com.coinsec.backend.bookkeeping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coinsec.backend.bookkeeping.entity.AccountTransactionsRecord;

/**
 * <p>
 * 核心交易记录表（所有收支/转账明细，受RLS保护）- 已启用RLS Mapper 接口
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public interface AccountTransactionsRecordMapper extends BaseMapper<AccountTransactionsRecord> {

}
