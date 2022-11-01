package ru.otus.homeworks.hw02;

import java.util.ArrayList;

public class QuestionsList {
    public static ArrayList<Questions> questionsListMethod() {

        ArrayList<Questions> questionsList = new ArrayList<Questions>();
        questionsList.add(new Questions(
                "Как меня зовут?",
                "Никак",
                "Сергей",
                2));
        questionsList.add(new Questions(
                "Название планеты?",
                "Земля",
                "Грязь",
                1));
        questionsList.add(new Questions(
                "Ваш любимый цвет (Белый)?",
                "Белый",
                "Зеленый",
                1));

        return questionsList;
    }
}
