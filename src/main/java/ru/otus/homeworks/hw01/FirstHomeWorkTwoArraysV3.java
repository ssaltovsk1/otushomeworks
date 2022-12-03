package ru.otus.homeworks.hw01;

import java.util.Scanner;

public class FirstHomeWorkTwoArraysV3 {
    public static void main(String[] args) {

        System.out.println("Приступим к тестированию \nДля выбора ответа - нажмите номер ответа и Enter \nДля выхода наберите exit и нажмите Enter");

        Scanner scanner = new Scanner(System.in);

        String[] arrayQuestions = {"В чем смысл жизни", "С чего начинается река?", "Почему дует ветер"};
        String[][] arrayAnswers = {{"Не знаю", "42", "что такое \"Жизнь\""},
                                {"С ручейка", "Капли дождя", "Не скажу"},
                                {"Потому-что деревья качаются", "Переды давления", "Ветер относительно чего?"}};
        int[] arrayCorrectAnswers = {2, 3, 1};

        int correctAnswersInt = 0;
        int incorrectAnswersInt = 0;

        for (int i = 0; i < arrayQuestions.length; i++) {
            System.out.println(arrayQuestions[i]);
            for (int j = 0; j <arrayAnswers.length; j++) {
                System.out.println((j+1) + ". " + arrayAnswers[i][j]);
            }
            String answer = scanner.nextLine();

            if (answer.toLowerCase().trim().equals("exit")) {
                System.out.println("До свидания");
                break;
            }
            else if (Integer.valueOf(answer) == arrayCorrectAnswers[i]) {
                correctAnswersInt++;
                System.out.println("Правильно");
            }
            else {
                incorrectAnswersInt++;
                System.out.println("Не правильно");
            }
        }
        System.out.println("Правильных ответов: " + correctAnswersInt);
        System.out.println("Неправильных ответов: " + incorrectAnswersInt);
    }

}