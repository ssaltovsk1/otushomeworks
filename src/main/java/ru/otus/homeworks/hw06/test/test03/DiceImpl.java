package ru.otus.homeworks.hw06.test.test03;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        return new Random().nextInt();
    }
}
