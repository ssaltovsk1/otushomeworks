package ru.otus.homeworks.hw06.test.test01;

import ru.otus.homeworks.hw06.test.Dice;

public class DiceTestImplTest01 implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        return 5;
    }
}
