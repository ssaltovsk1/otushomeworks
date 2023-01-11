package ru.otus.homeworks.hw04.v2;

import java.util.*;
import java.util.stream.Collectors;

import static ru.otus.homeworks.hw04.v2.AccountsList.*;

public class MainHash {
        static HashMap<Client, HashSet<Account>> accountsAndClientsListMapSet;

    public static void main(String[] args) {

        accountsAndClientsListMapSet = new HashMap<>();

        Client toAddClientToMethod721 = new Client("Вася",19,1233211);
        Client clientPetya = new Client("Петя",33,12933211);
        Client clientNik = new Client("Николай",43,6123456);

        createAndAddAccountToHashSet(clientPetya, 777, 877,7666,67867);
        accountsAndClientsListMapSet.put(clientNik, new HashSet<>());

        System.out.println("Номера аккаунтов по имени " + getAccountIdFromClientName("Петя"));
        System.out.println("getNameFromAccountId, возвращаем имя - " + getNameFromAccountId(12933211));
    }
}