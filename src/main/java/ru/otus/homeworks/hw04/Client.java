package ru.otus.homeworks.hw04;

import java.util.HashMap;

public class Client {

//        public static HashMap<Integer, Client> clientsList;

        String firstName;
        String sureName;
        int clientAge, clientId;

        Client(String firstName, String sureName, int clientAge, int clientId) {
            this.firstName = firstName;
            this.sureName = sureName;
            this.clientAge = clientAge;
            this.clientId = clientId;
        }

//    protected static void createClientsList() {
//        HashMap<Integer, Client> clientsList = new HashMap<>();
//
//        clientsList.put(1, new Client("Ivan(Double)", "Petrov", 10, 1));
//        clientsList.put(2, new Client("Sergey", "Nikolaev", 24, 2));
//        clientsList.put(3, new Client("Ivan(Double)", "Petrov", 17, 3));
//        clientsList.put(43, new Client("Petr", "Semenov", 97, 43));
//
//    }

    public static Client setClientToList(int key, String firstName, String sureName, int clientAge, int clientId){
            return MainHash.clientsList.put(key, new Client(firstName, sureName, clientAge, clientId));
    }
}
