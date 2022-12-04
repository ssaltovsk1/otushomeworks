package ru.otus.homeworks.hw02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Question> questionList;
    public static void main(String[] args) {

        questionList = new ArrayList<>();

        questionList.add(new Question(
                "Как меня зовут?",
                2,
                List.of("Никак", "Сергей", "Николай"))
        );
        questionList.add(new Question(
                "Название планеты?",
                4,
                new ArrayList<>(List.of("Плутон", "Нептун", "Юпитер", "Венера (правильный ответ)"))
        ));
        questionList.add(new Question(
                "Ваш любимый цвет (Белый)?",
                1,
                new ArrayList<>(List.of("Белый", "Красный"))
        ));

        System.out.println("Начнем");

        PrintOutQuestions.answerQuestions();
    }
}