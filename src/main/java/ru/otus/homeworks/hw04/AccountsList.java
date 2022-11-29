package ru.otus.homeworks.hw04;

import java.util.ArrayList;

import static ru.otus.homeworks.hw04.Client.*;
import static ru.otus.homeworks.hw04.MainHash.*;
import static ru.otus.homeworks.hw04.Tenge.accountTengeList;

public class AccountsList {

    static ArrayList<Integer> getClientAccountsFromName(String clientName) {

        ArrayList<Integer> clientAccountsList = new ArrayList<>();

        for (Client value : MainHash.clientsList.values()) {
            if (value.firstName.equalsIgnoreCase(clientName)) {
                for (Integer key : rublesVariableHashMap.keySet()) {
                    if (value.clientId == key) {
                        System.out.println("ID клиента: " + key + " Номер счета в рублях: " + rublesVariableHashMap.get(key).accountRublesId);
                        clientAccountsList.add((int) rublesVariableHashMap.get(key).accountRublesId);
                    }
                }
                for (Integer key : accountTengeList().keySet()) {
                    if (value.clientId == key) {
                        System.out.println("ID клиента: " + key + " Номер счета в тенге: " + accountTengeList().get(key).accountTengeId);
                        clientAccountsList.add((int) accountTengeList().get(key).accountTengeId);
                    }
                }
            }
            if (clientAccountsList.size() < 0) {
                System.out.println("There's no accounts for this client");
            }

        }
        return clientAccountsList;
    }

    static ArrayList<Client> getNameFromAccounts(int accountNumber) {

        ArrayList<Client> clientNameList = new ArrayList<>();

        for (Rubles value : rublesVariableHashMap.values()) {
            if (value.accountRublesId == accountNumber) {
                for (Integer key : MainHash.clientsList.keySet()) {
                    if (value.accountClientId == key) {
                        System.out.println("ID клиента: " + key + " Client Name with Roubles: " + MainHash.clientsList.get(key).firstName);
                        clientNameList.add(MainHash.clientsList.get(key));
                    }
                }
            }
        }
        for (Tenge value : accountTengeList().values()) {
            if (value.accountTengeId == accountNumber) {
                for (Integer key : MainHash.clientsList.keySet()) {
                    if (value.accountClientId == key) {
                        System.out.println("ID клиента: " + key + " Client Name with Roubles: " + MainHash.clientsList.get(key).firstName);
                        clientNameList.add(MainHash.clientsList.get(key));
                    }
                }
            }
        }

        if (clientNameList.size() < 1) {
            System.out.println("There's no clients for this Account Number");
        }

        return clientNameList;
    }
}
