package ru.otus.homeworks.hwfinal.v3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataInput {

    static String inputData;

    public static String getInputData() {

        System.out.println("Введите число");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            inputData = reader.readLine();
            while (inputData.matches("^[a-zA-Z]*$")) {
                System.out.println("Введите только число, без символов");
                inputData = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Неужели ошибка?!");
        }

        return inputData;
    }
}
