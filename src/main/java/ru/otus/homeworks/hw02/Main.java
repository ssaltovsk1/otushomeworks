package ru.otus.homeworks.hw02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static ArrayList<Questions> questionsList;
    public static void main(String[] args) {

        questionsList = new ArrayList<>();

        questionsList.add(new Questions(
                "Как меня зовут?",
                2,
                new ArrayList<>(List.of("Никак", "Сергей", "Николай"))
        ));
        questionsList.add(new Questions(
                "Название планеты?",
                4,
                new ArrayList<>(List.of("Плутон", "Нептун", "Юпитер", "Венера (правильный ответ)"))
        ));
        questionsList.add(new Questions(
                "Ваш любимый цвет (Белый)?",
                1,
                new ArrayList<>(List.of("Белый", "Красный"))
        ));

        System.out.println("Начнем");

        PrintOutQuestions.answerQuestions();
    }


}