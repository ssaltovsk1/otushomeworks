package ru.otus.homeworks.hw04;

import java.util.HashMap;

public class Tenge {

    int accountClientId;
    int accountTengeId;
    private long amountOfTenge;

    public Tenge(int accountId, int accountTengeId, long amountOfTenge) {
        this.accountClientId = accountId;
        this.accountTengeId = accountTengeId;
        this.amountOfTenge = amountOfTenge;
    }

    static HashMap<Integer, Tenge> accountTengeList() {
        HashMap<Integer, Tenge> accountTengeList = new HashMap<>();
        accountTengeList.put(1, new Tenge(1, 1223, 382993483));
        accountTengeList.put(122, new Tenge(23232, 1223232, 239899));

        return accountTengeList;
    }

}
