package ru.otus.homeworks.hw04;

import java.util.ArrayList;
import java.util.HashMap;
import static ru.otus.homeworks.hw04.Rubles.setRublesToAccountList;
import static ru.otus.homeworks.hw04.Client.setClientToList;


public class MainHash {
        public static HashMap<Integer, Client> clientsList;
        public static HashMap<Integer, Rubles> rublesVariableHashMap;

    public static void main(String[] args) {

        clientsList = new HashMap<>();
        clientsList.put(1, new Client("Ivan(Double)", "Petrov", 10, 1));
        clientsList.put(2, new Client("Sergey", "Nikolaev", 24, 2));
        clientsList.put(3, new Client("Ivan(Double)", "Petrov", 17, 3));
        clientsList.put(43, new Client("Petr", "Semenov", 97, 43));

        setClientToList(122,"FromMain","SureName",12,122);


            rublesVariableHashMap = new HashMap<>();
            rublesVariableHashMap.put(3, new Rubles(3, 23743, 43223));

            setRublesToAccountList(1,2329,76);
            setRublesToAccountList(2,2332,225322233);

        System.out.println(AccountsList.getClientAccountsFromName("FromMain"));
        System.out.println(AccountsList.getNameFromAccounts(2329));

    }




}