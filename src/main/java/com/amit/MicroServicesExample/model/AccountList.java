package com.amit.MicroServicesExample.model;

import java.util.List;

public class AccountList {

    private AccountOpen[] accountOpenList;

    public AccountList(){}
    public AccountList(AccountOpen[] accountOpenList) {
        this.accountOpenList = accountOpenList;
    }

    public AccountOpen[] getAccountOpenList() {
        return accountOpenList;
    }

    public void setAccountOpenList(AccountOpen[] accountOpenList) {
        this.accountOpenList = accountOpenList;
    }
}
