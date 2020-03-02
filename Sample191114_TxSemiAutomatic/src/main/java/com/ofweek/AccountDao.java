package com.ofweek;

public interface AccountDao {
    public void moneyOut(String payer, float money);
    public void moneyIn(String payee, float money);
}
