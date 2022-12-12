package ru.otus.homeworks.hw06.test.test03;

import ru.otus.homeworks.hw06.assertions.Assertions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;


public class GameTest03 {

private final Dice dice = new DiceImpl();
private final GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinterDump();
private final Game game = new Game(dice, winnerPrinter);
private final Player vasya = new Player("Вася");
private final Player igor = new Player ("Игорь");



    public void gameTest03() {
        String scenario = "Правильный вывод в консоль победителя. Заранее задаем победителя";

        try {
            String expected = "Победитель: Test";

            Scanner scanner = new Scanner(System.in);
            String actual = scanner.next();
            game.playGame(vasya, igor);

            Assertions.assertEquals(expected, actual);

            scanner.close();

            System.out.printf("\"%s\" passed %n", scenario);



        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }
}
