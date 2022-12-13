package ru.otus.homeworks.hw06.test.test03;


import ru.otus.homeworks.hw06.test.Player;

public class GameWinnerConsolePrinterTest03 implements GameWinnerPrinterTest03 {


    @Override
    public void printWinner(Player winner) {

        System.out.printf("Победитель: %s%n", winner.getName());
        // Так тест проходит:
        // System.out.printf("Победитель: Игорь");

    }
}



