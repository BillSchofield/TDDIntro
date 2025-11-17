package com.thoughtworks.tddintro.exercises.accountbalance;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AccountTests {
    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account();
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
