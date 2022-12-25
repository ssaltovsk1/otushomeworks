package ru.otus.homeworks.hw04.v2;

import java.util.*;
import java.util.stream.Collectors;

import static ru.otus.homeworks.hw04.v2.MainHash.*;

public class AccountsList {

    static HashMap<Client, HashSet<Account>> createAndAddAccountToHashSet(Client key, int rublesAccountId, int tengeAccountId, long rublesAccountAmount, long tengeAccountAmount) {

        if (accountsAndClientsListMapSet.containsKey(key)) {
            accountsAndClientsListMapSet.get(key).add(new Account(key.getAccountID(), rublesAccountId, tengeAccountId, rublesAccountAmount, tengeAccountAmount));
        } else {
            HashSet<Account> set = new HashSet<>();
            set.add(new Account(key.getAccountID(), rublesAccountId, tengeAccountId, rublesAccountAmount, tengeAccountAmount));
            accountsAndClientsListMapSet.put(key, set);
        }
        return accountsAndClientsListMapSet;
    }

    static List<Integer> getAccountIdFromClientName(String clientName){
        ArrayList<Account> tempArray = new ArrayList<>();
        ArrayList<Integer> tempIntegerArray = new ArrayList<>();

        for (Client client : accountsAndClientsListMapSet.keySet()) {
            if (client.getFirstName().equalsIgnoreCase(clientName)) {
                accountsAndClientsListMapSet.get(client).stream().collect(Collectors.toCollection(() -> tempArray));
                for (Account account : tempArray) {
                    tempIntegerArray.add(account.getTengeAccountId());
                    tempIntegerArray.add(account.getRublesAccountId());
                }
                return tempIntegerArray;
            }
        }
        return null;
    }

    static List<Integer> getAccountIdFromClientAccountName(Client accountKey){
        ArrayList<Account> tempArray = new ArrayList<>();
        ArrayList<Integer> tempIntegerArray = new ArrayList<>();
        if (accountsAndClientsListMapSet.containsKey(accountKey)) {
            accountsAndClientsListMapSet.get(accountKey).stream().collect(Collectors.toCollection(() -> tempArray));
            for (Account account : tempArray) {
                tempIntegerArray.add(account.getTengeAccountId());
                tempIntegerArray.add(account.getRublesAccountId());
            }
            return tempIntegerArray;
        }
        return null;
    }
    static String getNameFromAccountId(int accountId){

        for (Client client : accountsAndClientsListMapSet.keySet()) {
            if (client.getAccountID() == accountId) {
                return client.getFirstName();
            }
        }

        return "клиент не найден";
    }
}
