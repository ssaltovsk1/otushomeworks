package ru.otus.homeworks.hw06.test.test03;

public class GameWinnerConsolePrinterDump implements GameWinnerPrinter {

    @Override
    public void printWinner(Player winner) {
        System.out.printf("Победитель: Test \n");
    }
}
