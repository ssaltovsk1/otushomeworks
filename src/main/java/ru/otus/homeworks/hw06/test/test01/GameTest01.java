package ru.otus.homeworks.hw06.test.test01;

import ru.otus.homeworks.hw06.assertions.Assertions;
import ru.otus.homeworks.hw06.test.Dice;

public class GameTest01 {

    private final Dice dice = new DiceTestImplTest01();

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
