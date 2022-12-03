package ru.otus.homeworks.hw02;

import java.util.ArrayList;
import static ru.otus.homeworks.hw02.Main.questionsList;

public class Questions {

    private String question, answerFirst, answerSecond;
    ArrayList<String> answersList;
    private int correctAnswerNumber;

    public Questions(String question, int correctAnswerNumber, ArrayList<String> answersList) {
        this.question = question;
        this.correctAnswerNumber = correctAnswerNumber;
        this.answersList = answersList;
    }



    public String getAnswerToList(int answerNumber) {
        return answersList.get(answerNumber);
    }
    public void setAnswerToList(String answerToList) {
        this.answersList.add(answerToList);
    }
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public int getCorrectAnswerNumber() { return correctAnswerNumber; }
    public void setCorrectAnswerNumber(int correctAnswerNumber) {
        if (0 < correctAnswerNumber && correctAnswerNumber < 3) {
            this.correctAnswerNumber = this.correctAnswerNumber;
        } else {
            System.out.println("Введи 1 или 2. В зависимости от того, какой ответ правильный");
        }
    }

    public static void printOutQuestions(int number) {

        System.out.println("\n" + questionsList.get(number).getQuestion());
        for (int i = 0; i < questionsList.get(number).answersList.size(); i++) {
            System.out.println((i+1) + ". " + questionsList.get(number).getAnswerToList(i));
        }
    }

}