package ru.otus.homeworks.hw06.test.test01;

import ru.otus.homeworks.hw06.assertions.Assertions;
import ru.otus.homeworks.hw06.test.test01.*;
import ru.otus.homeworks.hw06.test.test01.Dice;
import ru.otus.homeworks.hw06.test.test01.DiceImpl;

public class GameTest01 {

    private final Dice dice = new DiceImpl();
    private final GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
    private final Game game = new Game(dice, winnerPrinter);
    private final Player vasya = new Player("Вася");
    private final Player igor = new Player("Игорь");

    public void gameTest01() {
        String scenario = "Фиксированное значение метода Dice";

        try {
            int expected = dice.roll();
            int actual = 5;
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }

}
