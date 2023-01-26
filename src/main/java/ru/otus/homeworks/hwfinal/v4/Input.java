package ru.otus.homeworks.hwfinal.v4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static int getInputData() {

        int inputData = 0;

        System.out.println("Введите число. \n С цифрами разрядов до 4, включительно. И разрядом до 000");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            inputData = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Неужели ошибка?!");
        }

        return inputData;
    }
}
