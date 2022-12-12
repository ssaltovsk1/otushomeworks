package ru.otus.homeworks.hw06.test.test02;

import ru.otus.homeworks.hw06.assertions.Assertions;

public class GameTest02 {

    private final Dice dice = new DiceImpl();
    private final GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();

    public void gameTest02() {
        String scenario = "Значение Dice должно быть в пределах от 0 до 6";

        try {
            for (int i = 0; i < 10; i++) {
                int actual = dice.roll();
                for (int j = 0; j < 7; j++) {
                    Assertions.assertEquals(j, actual);
                }
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
