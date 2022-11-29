package ru.otus.homeworks.hw04;

import java.util.HashMap;

import static ru.otus.homeworks.hw04.MainHash.*;

public class Rubles {

        int accountClientId, accountRublesId;
        long amountOfRubles;

        public Rubles(int accountClientId, int accountRublesId, long amountOfRubles) {
            this.accountClientId = accountClientId;
            this.accountRublesId = accountRublesId;
            this.amountOfRubles = amountOfRubles;
        }

    public static Rubles setRublesToAccountList(int accountClientId, int accountRublesId, long amountOfRubles) {
        return rublesVariableHashMap.put(accountRublesId, new Rubles(accountClientId, accountRublesId, amountOfRubles));
    }
//    static HashMap<Integer, Rubles> accountRublesList() {
//        HashMap<Integer, Rubles> accountRublesList = new HashMap<>();
//        accountRublesList.put(1, new Rubles(1, 232938, 76));
//        accountRublesList.put(2, new Rubles(2, 23983894, 225322233));
//        accountRublesList.put(3, new Rubles(3, 23743, 43223));
//
//        return accountRublesList;
//    }

}


