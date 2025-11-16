package com.coinsec.backend.bookkeeping.service.impl;

import com.coinsec.backend.bookkeeping.entity.AccountTransactionsCategory;
import com.coinsec.backend.bookkeeping.mapper.AccountTransactionsCategoryMapper;
import com.coinsec.backend.bookkeeping.service.IAccountTransactionsCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 收支分类表（支持多级分类，受RLS保护）- 已启用RLS 服务实现类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Service
public class AccountTransactionsCategoryServiceImpl extends ServiceImpl<AccountTransactionsCategoryMapper, AccountTransactionsCategory> implements IAccountTransactionsCategoryService {

}
