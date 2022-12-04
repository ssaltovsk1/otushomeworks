package ru.otus.homeworks.hw02;

import java.util.ArrayList;
import java.util.List;

import static ru.otus.homeworks.hw02.Main.questionList;

public class Question {

    private String question, answerFirst, answerSecond;
    List<String> answersList;
    private int correctAnswerNumber;

    public Question(String question, int correctAnswerNumber, List<String> answersList) {
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
}