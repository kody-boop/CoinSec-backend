package com.coinsec.backend.bookkeeping.service;

import com.coinsec.backend.bookkeeping.entity.AccountTransactionsRecord;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 核心交易记录表（所有收支/转账明细，受RLS保护）- 已启用RLS 服务类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public interface IAccountTransactionsRecordService extends IService<AccountTransactionsRecord> {

}
