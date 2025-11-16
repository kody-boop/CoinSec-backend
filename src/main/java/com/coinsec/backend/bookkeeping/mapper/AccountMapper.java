package com.coinsec.backend.bookkeeping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coinsec.backend.bookkeeping.entity.Account;

/**
 * <p>
 * 用户资金账户表（受RLS保护，仅用户可见）- 已启用RLS Mapper 接口
 * </p>
 *
 * @author kody
 * @since 2025-11-16
 */
public interface AccountMapper extends BaseMapper<Account> {

}
