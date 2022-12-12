package ru.otus.homeworks.hw06.test.test01;

import ru.otus.homeworks.hw06.test.test01.Dice;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        return 5;
    }
}
