package com.esra.fakerestapi.models;

public class Account {

    private String accountType;
    private String currency;

    public Account() {
    }

    public Account(String accountType,
                   String currency) {

        this.accountType = accountType;
        this.currency = currency;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}