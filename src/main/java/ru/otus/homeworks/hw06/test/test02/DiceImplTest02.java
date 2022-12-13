package ru.otus.homeworks.hw06.test.test02;

import ru.otus.homeworks.hw06.test.Dice;

import java.util.Random;

public class DiceImplTest02 implements DiceTest02 {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        return new Random().nextInt();
    }
}
