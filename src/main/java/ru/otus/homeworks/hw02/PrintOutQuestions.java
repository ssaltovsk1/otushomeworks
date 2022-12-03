package ru.otus.homeworks.hw02;

import java.util.Scanner;

import static ru.otus.homeworks.hw02.Main.questionsList;

public class PrintOutQuestions {
    static void answerQuestions() {

        int amountOfCorrectAnswers = 0;
        int amountOfIncorrectAnswers = 0;

        for (int i = 0; i < questionsList.size(); i++) {
            Questions.printOutQuestions(i);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            int answerInt = Integer.valueOf(answer);

            if (answerInt == questionsList.get(i).getCorrectAnswerNumber()) {
                amountOfCorrectAnswers++;
                System.out.println("Правильно");
            }
            else {
                amountOfIncorrectAnswers++;
                System.out.println("Не правильно");
            }

        }
        System.out.println("Правильных ответов: " + amountOfCorrectAnswers);
        System.out.println("Неправильных ответов: " + amountOfIncorrectAnswers);

    }
}