package ru.otus.homeworks.hw06.test.test03;

import ru.otus.homeworks.hw06.assertions.Assertions;
import ru.otus.homeworks.hw06.test.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class GameTest03 {

private final Dice dice = new DiceImpl();
private final GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinterTest03();
private final Game game = new Game(dice, winnerPrinter);
private final Player igor = new Player ("Игорь");
private final Player vasya = new Player ("Василий");



    public void gameTest03() {
        String scenario = "Правильный вывод в консоль победителя. Победитель заранее задан";
        PrintStream originalOut = System.out;
        try {
            String expected = "Победитель: Игорь";
            String consoleOutPut;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);

            game.playGame(vasya, igor);

            capture.flush();
            consoleOutPut = outputStream.toString();
            System.setOut(originalOut);
            Assertions.assertEquals(expected, consoleOutPut);

            System.out.printf("\"%s\" passed %n", scenario);

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }
}
