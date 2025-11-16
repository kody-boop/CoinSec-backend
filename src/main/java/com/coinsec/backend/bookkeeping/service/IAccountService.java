package com.coinsec.backend.bookkeeping.service;

import com.coinsec.backend.bookkeeping.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户资金账户表（受RLS保护，仅用户可见）- 已启用RLS 服务类
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public interface IAccountService extends IService<Account> {

}
