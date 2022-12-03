package ru.otus.homeworks.hw01;

import java.util.Arrays;
import java.util.Scanner;


public class FirstHomeWorkWithOneArray {
    public static void main(String[] args) {

        System.out.println("Приступим к тестированию \nДля выбора ответа - нажмите номер ответа и Enter \nДля выхода наберите exit и нажмите Enter");

        Scanner scanner = new Scanner(System.in);

        String[][][] matrix = {
                {
                        {"2"},
                        {"В чем смысл жизни"},
                        {"Не знаю", "42", "А что такое \"Жизнь\""}
                },
                {
                        {"1"},
                        {"С чего начинается река?"},
                        {"С ручейка", "Капли дождя", "Не скажу"}
                },
                {
                        {"3"},
                        {"Почему дует ветер?"},
                        {"Потому-что деревья качаются", "Переды давления", "Не скажу"}
                }
        };

//        System.out.println(matrix[2][0][0]);

        for (int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i][1].length; j++) {
                System.out.println(matrix[i][1][0]);

                for(int k = 0; k < matrix[i][2].length; k++) {
                    System.out.println((k+1) + ". " + matrix[i][2][k]);
                }
                    String answer = scanner.nextLine();

                    if (answer.toLowerCase().trim().equals("exit")) {
                        System.out.println("До свидания");
                        break;
                    } else if (Integer.parseInt(answer) == Integer.parseInt(matrix[i][0][0])) {
                        System.out.println("Правильно");
                    } else {
                        System.out.println("Не правильно");
                    }

            }
        }
    }
}