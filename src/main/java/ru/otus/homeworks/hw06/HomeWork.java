package ru.otus.homeworks.hw06;


import ru.otus.homeworks.hw06.test.test01.GameTest01;
import ru.otus.homeworks.hw06.test.test02.GameTest02;
import ru.otus.homeworks.hw06.test.test03.GameTest03;
import ru.otus.homeworks.hw06.test.test04.GameTest04;


public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {



        System.out.println("Начали тест 1. Фиксированное значение Dice");
        new GameTest01().gameTest01();
        System.out.println("Закончили тест 1 \n");

        System.out.println("Начали тест 2. Значение Dice должно быть в пределах от 0 до 6");
        new GameTest02().gameTest02();
        System.out.flush();
        System.err.flush();
        System.out.println("Закончили тест 2 \n");

        System.out.println("Начали тест 3. Соответствие заданного имени Player");
        new GameTest03().gameTest03();
        System.out.println("Закончили тест 3");

        System.out.println("Начали тест 4. Соответствие заданного имени Player");
        new GameTest04().gameTest04();
        System.out.println("Закончили тест 4");

    }
    
}