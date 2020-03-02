package com.ofweek;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public void transfer(String payer, String payee, float money) {
        this.accountDao.moneyOut(payer, money);
        int i = 1/0;
        this.accountDao.moneyIn(payee, money);
    }

    public void payTrusteeFee(String payer, float money) {
        this.accountDao.moneyOut(payer, money);
    }
}
