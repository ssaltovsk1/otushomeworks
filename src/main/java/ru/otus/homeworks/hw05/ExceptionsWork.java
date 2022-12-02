package ru.otus.homeworks.hw05;

import java.io.*;
import java.util.ArrayList;

public class ExceptionsWork {

    static ArrayList<Goods> goodsList;
    public static void main(String[] args) throws IOException, PersonalException {

        goodsList = new ArrayList<>();

        String testFile = "demotxt";

        ImportFromFile.writeGoodsFromFile(testFile);

        try {
            GoodsList.addGoodToList(0, 233);

        } catch (Exception e) {
            System.out.println("Следующая ошибка. Печатаем StackTrace");
            e.printStackTrace();
        }
        GoodsList.addGoodToList(12000, 233);
    }

}
