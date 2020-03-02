package com.ofweek;

public interface AccountDao {
    public void moneyIn(String payee, float money);
    public void moneyOut(String payer, float money);
}
