package ru.otus.homeworks.hw02;

public class Questions {

    private String question, answerFirst, answerSecond;
    private int correctAnswerNumber;

    public Questions(String question, String answerFirst, String answerSecond, int correctAnswerNumber) {
        this.question = question;
        this.answerFirst = answerFirst;
        this.answerSecond = answerSecond;
        this.correctAnswerNumber = correctAnswerNumber;
    }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public String getAnswerFirst() { return answerFirst; }
    public void setAnswerFirst(String answerFirst) { this.answerFirst = answerFirst; }
    public String getAnswerSecond() { return answerSecond; }
    public void setAnswerSecond(String answerSecond) { this.answerSecond = answerSecond; }
    public int getCorrectAnswerNumber() { return correctAnswerNumber; }
    public void setCorrectAnswerNumber(int answerNumber) {
        if (0 < answerNumber && answerNumber < 3) {
            this.correctAnswerNumber = correctAnswerNumber;
        } else {
            System.out.println("Введи 1 или 2. В зависимости от того, какой ответ правильный");
        }
    }

    public static void printOutQuestions(int number) {

        System.out.println("\n" + QuestionsList.questionsListMethod().get(number).getQuestion());
        System.out.println("1. " + QuestionsList.questionsListMethod().get(number).getAnswerFirst());
        System.out.println("2. " + QuestionsList.questionsListMethod().get(number).getAnswerSecond());
    }

}







