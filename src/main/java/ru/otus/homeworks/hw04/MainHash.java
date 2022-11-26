package ru.otus.homeworks.hw04;

import java.util.ArrayList;
import java.util.HashMap;

public class MainHash {

    public static void main(String[] args) {

        System.out.println(AccountsList.getClientAccountsFromName("Ivan(Double)"));
        System.out.println(AccountsList.getNameFromAccounts(1223));

    }


    public static class Client {
        private String firstName, sureName;
        private int clientAge, clientId;

        public Client(String firstName, String sureName, int clientAge, int clientId) {
            this.firstName = firstName;
            this.sureName = sureName;
            this.clientAge = clientAge;
            this.clientId = clientId;
        }
    }

    public static class AccountsList {

        public static ArrayList<Integer> getClientAccountsFromName(String clientName) {

            int tempClientId;

            ArrayList<Integer> clientAccountsList = new ArrayList<>();

            for (Client value : accountsList().values()) {
                if (value.firstName.equalsIgnoreCase(clientName)) {
                    for (Integer key : accountRublesList().keySet()) {
                        if (value.clientId == key) {
                            System.out.println("ID клиента: " + key + " Номер счета в рублях: " + accountRublesList().get(key).accountRublesId);
                            clientAccountsList.add((int) accountRublesList().get(key).accountRublesId);
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

        public static ArrayList<String> getNameFromAccounts(int accountNumber) {

            int tempRubClientId, tempTengeClientId;
            ArrayList<String> clientNameList = new ArrayList<>();

            for (Rubles value : accountRublesList().values()) {
                if (value.accountRublesId == accountNumber) {
                    tempRubClientId = value.accountClientId;
                    for (Integer key : accountsList().keySet()) {
                        if (tempRubClientId == key) {
                            System.out.println("ID клиента: " + key + " Client Name with Roubles: " + accountsList().get(key).firstName);
                            clientNameList.add(accountsList().get(key).firstName);
                        }
                    }
                }
            }
            for (Tenge value : accountTengeList().values()) {
                if (value.accountTengeId == accountNumber) {
                    tempTengeClientId = value.accountId;
                    for (Integer key : accountsList().keySet()) {
                        if (tempTengeClientId == key) {
                            System.out.println("ID клиента: " + key + " Client Name with Roubles: " + accountsList().get(key).firstName);
                            clientNameList.add(accountsList().get(key).firstName);
                        }
                    }
                }
            }

            if (clientNameList.size() < 1) {
                System.out.println("There's no clients for this Account Number");
            }

            return clientNameList;
        }

        public static class Rubles {
            int accountClientId, accountRublesId;
            long amountOfRubles;

            public Rubles(int accountClientId, int accountRublesId, long amountOfRubles) {
                this.accountClientId = accountClientId;
                this.accountRublesId = accountRublesId;
                this.amountOfRubles = amountOfRubles;
            }
        }

        public static class Tenge {

            int accountId, accountTengeId;
            long amountOfTenge;

            public Tenge(int accountId, int accountTengeId, long amountOfTenge) {
                this.accountId = accountId;
                this.accountTengeId = accountTengeId;
                this.amountOfTenge = amountOfTenge;
            }
        }

        public static HashMap<Integer, Client> accountsList() {
            HashMap<Integer, Client> accountsList = new HashMap<>();

            accountsList.put(1, new Client("Ivan(Double)", "Petrov", 10, 1));
            accountsList.put(2, new Client("Sergey", "Nikolaev", 24, 2));
            accountsList.put(3, new Client("Ivan(Double)", "Petrov", 17, 3));
            accountsList.put(43, new Client("Petr", "Semenov", 97, 43));
            accountsList.put(5, new Client("with 879 Age and 5 client Id", "Semenov", 879, 5));
            accountsList.put(879, new Client("with 879 Id", "Semenov", 9, 8791));
            accountsList.put(23232, new Client("Nikol", "Dubov", 32, 23232));

            return accountsList;
        }

        private static HashMap<Integer, Rubles> accountRublesList() {
            HashMap<Integer, Rubles> accountRublesList = new HashMap<>();
            accountRublesList.put(1, new Rubles(1, 232938, 76));
            accountRublesList.put(2, new Rubles(2, 23983894, 225322233));
            accountRublesList.put(3, new Rubles(3, 23743, 43223));
            accountRublesList.put(4, new Rubles(4, 233899, 3));
            accountRublesList.put(43, new Rubles(43, 2374333, 9));

            return accountRublesList;
        }

        private static HashMap<Integer, Tenge> accountTengeList() {
            HashMap<Integer, Tenge> accountTengeList = new HashMap<>();
            accountTengeList.put(1, new Tenge(1, 1223, 382993483));
            accountTengeList.put(23232, new Tenge(23232, 1223232, 239899));
            accountTengeList.put(879, new Tenge(879, 13232, 7539));
            accountTengeList.put(43, new Tenge(879, 132, 7539));

            return accountTengeList;
        }
    }
}