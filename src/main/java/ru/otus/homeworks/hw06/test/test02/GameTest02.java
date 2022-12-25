package ru.otus.homeworks.hw06.test.test02;

import ru.otus.homeworks.hw06.assertions.Assertions;
import ru.otus.homeworks.hw06.test.Dice;
import ru.otus.homeworks.hw06.test.DiceImpl;

public class GameTest02 {

    private final Dice dice = new DiceImpl();

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
            System.out.flush();

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            System.err.flush();
        }
    }
}
