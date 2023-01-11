package ru.otus.homeworks.hw05;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ExceptionsWork {

    public static ArrayList<Good> goodList;
    public static void main(String[] args) throws PersonalException, IOException {

        goodList.add(new Good(12,211));

        try {
            goodList = new ArrayList<>(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании ArrayList с initialCapacity (-1). с Finally");
        } finally {
            goodList = new ArrayList<>();
        }

        String testFile = "demo";
        ImportFromFile.writeGoodsFromFile(testFile);

        try {
                goodList.add(3,new Good(1, 233));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка добавлнения по неправильному индексу. Печатаем StackTrace");
            e.printStackTrace();
        }
        AddGoodsToList.addGoodToList(120, 233);

        WriteToFile.writeToFile(Paths.get("C:\\testFile.txt"), goodList.get(0));
    }

}
