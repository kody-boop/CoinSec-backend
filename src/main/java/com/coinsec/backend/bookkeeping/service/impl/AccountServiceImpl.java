package com.coinsec.backend.bookkeeping.service.impl;

import com.coinsec.backend.bookkeeping.entity.Account;
import com.coinsec.backend.bookkeeping.mapper.AccountMapper;
import com.coinsec.backend.bookkeeping.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户资金账户表（受RLS保护，仅用户可见）- 已启用RLS 服务实现类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
