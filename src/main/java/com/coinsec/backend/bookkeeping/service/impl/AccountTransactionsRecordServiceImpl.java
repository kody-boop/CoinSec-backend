package com.coinsec.backend.bookkeeping.service.impl;

import com.coinsec.backend.bookkeeping.entity.AccountTransactionsRecord;
import com.coinsec.backend.bookkeeping.mapper.AccountTransactionsRecordMapper;
import com.coinsec.backend.bookkeeping.service.IAccountTransactionsRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 核心交易记录表（所有收支/转账明细，受RLS保护）- 已启用RLS 服务实现类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Service
public class AccountTransactionsRecordServiceImpl extends ServiceImpl<AccountTransactionsRecordMapper, AccountTransactionsRecord> implements IAccountTransactionsRecordService {

}
