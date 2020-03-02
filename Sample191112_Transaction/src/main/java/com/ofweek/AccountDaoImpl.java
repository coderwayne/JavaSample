package com.ofweek;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public void moneyIn(String payee, float money) {
        this.getJdbcTemplate().update("update Account set money = money + ? where userName=?", money, payee);
    }

    public void moneyOut(String payer, float money) {
        this.getJdbcTemplate().update("update Account set money = money - ? where userName=?", money, payer);
    }
}
