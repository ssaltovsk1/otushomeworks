package ru.otus.homeworks.hw06.test.test04;

import ru.otus.homeworks.hw06.assertions.Assertions;
import ru.otus.homeworks.hw06.test.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class GameTest04 {

private final Dice dice = new DiceImpl();
private final GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinterTest04();
private final Game game = new Game(dice, winnerPrinter);
private static final Player igor = new Player ("Игорь");

private final Player vasya = new Player ("Вася");

public static String publicPlayer;

    public static Player getIgor() {
        return igor;
    }

    public void gameTest04() {
        String scenario = "Переписали метод GameWinnerConsolePrinter. Сравнение winner и игрока из игры";

        try {
            String expected = igor.getName();
            game.playGame(igor, igor);

            Assertions.assertEquals(expected, publicPlayer);

            System.out.printf("\"%s\" passed %n", scenario);

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}