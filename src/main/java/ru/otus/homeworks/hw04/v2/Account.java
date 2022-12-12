package ru.otus.homeworks.hw04.v2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Account {

    private final int rublesAccountId, tengeAccountId, accountClientId;
    private long rublesAccountAmount, tengeAccountAmount;

    public void setRublesAccountAmount(long rublesAccountAmount) {
        this.rublesAccountAmount = rublesAccountAmount;
    }

    public void setTengeAccountAmount(long tengeAccountAmount) {
        this.tengeAccountAmount = tengeAccountAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return rublesAccountId == account.rublesAccountId && tengeAccountId == account.tengeAccountId && accountClientId == account.accountClientId && rublesAccountAmount == account.rublesAccountAmount && tengeAccountAmount == account.tengeAccountAmount;
    }

    public int getRublesAccountId() {
        return rublesAccountId;
    }

    public int getTengeAccountId() {
        return tengeAccountId;
    }

    public int getAccountClientId() {
        return accountClientId;
    }

    public long getRublesAccountAmount() {
        return rublesAccountAmount;
    }

    public long getTengeAccountAmount() {
        return tengeAccountAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountClientId);
    }

    public Account(int accountClientID, int rublesAccountId, int tengeAccountId, long rublesAccountAmount, long tengeAccountAmount) {
        this.accountClientId = accountClientID;
        this.rublesAccountId = rublesAccountId;
        this.tengeAccountId = tengeAccountId;
        this.rublesAccountAmount = rublesAccountAmount;
        this.tengeAccountAmount = tengeAccountAmount;
    }
 }
