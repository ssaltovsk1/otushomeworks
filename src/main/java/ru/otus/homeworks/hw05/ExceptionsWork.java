package ru.otus.homeworks.hw05;

import java.io.*;
import java.util.ArrayList;

public class ExceptionsWork {

    static ArrayList<Goods> goodsList;
    public static void main(String[] args) throws IOException, PersonalException{

        try {
            goodsList = new ArrayList<>(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании ArrayList с initialCapacity (-1). с Finally");
        } finally {
            goodsList = new ArrayList<>();
        }

        String testFile = "demotxt";

        ImportFromFile.writeGoodsFromFile(testFile);

        try {
                goodsList.add(3,new Goods(1, 233));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка добавлнения по неправильному индексу. Печатаем StackTrace");
            e.printStackTrace();
        }
        AddGoodsToList.addGoodToList(120, 233);
    }

}
