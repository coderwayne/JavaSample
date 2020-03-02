package com.ofweek;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String payer, String payee, float money) {
        this.accountDao.moneyOut(payer, money);
        int i = 1/0;
        this.accountDao.moneyIn(payee, money);
    }

    public void payService(float money) {
        this.accountDao.moneyOut("jack", money);
        int i = 1/0;
        this.accountDao.moneyOut("rose", money);
    }
}
