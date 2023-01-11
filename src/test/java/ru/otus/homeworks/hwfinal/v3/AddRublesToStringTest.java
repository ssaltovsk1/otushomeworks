package ru.otus.homeworks.hwfinal.v3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddRublesToStringTest {

    AddRublesToString testAddRubles = new AddRublesToString();
    String textInIntegers = "323";
    String textToAddRubles = "триста двадцать три ";

    @Test
    void addCurrencyToText() {
        String expected = "триста двадцать три рубля";

        String actual = testAddRubles.addCurrencyToText(textInIntegers, textToAddRubles);

        Assertions.assertEquals(expected, actual);
    }
}