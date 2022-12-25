package ru.otus.homeworks.hw06.test.test03;


import ru.otus.homeworks.hw06.test.Player;
import ru.otus.homeworks.hw06.test.GameWinnerPrinter;

public class GameWinnerConsolePrinterTest03 implements GameWinnerPrinter {


    @Override
    public void printWinner(Player winner) {

        System.out.printf("Победитель: %s%n", winner.getName());
        // Так тест проходит:
        // System.out.printf("Победитель: Игорь");

    }
}



