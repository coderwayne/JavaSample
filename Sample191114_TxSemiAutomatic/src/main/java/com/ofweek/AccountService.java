package com.ofweek;

public interface AccountService {
    public void transfer(String payer, String payee, float money);

    public void payService(float money);
}
