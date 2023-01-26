package ru.otus.homeworks.hw06.test.test04;

import ru.otus.homeworks.hw06.test.*;

public class GameWinnerConsolePrinterTest04 implements GameWinnerPrinter {


    @Override
    public void printWinner(Player winner) {

        if (winner.getName().equals(GameTest04.getIgor().getName())) {
            GameTest04.publicPlayer = winner.getName();
        }

    }
}



