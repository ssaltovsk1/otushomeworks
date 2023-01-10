package ru.otus.homeworks.hwfinal.v3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main mainToTest = new Main();
    private String textToConvert = "";
    private Map<Integer, String> actual = new HashMap<>();
    private Map<Integer, String> result = new HashMap<>();

    @Test
    void convertIntegerToStringSaveToMap() {

        textToConvert = "321";
        result = mainToTest.convertIntegerToStringSaveToMap(textToConvert);

        actual.put(0, "1");
        actual.put(1, "2");
        actual.put(2, "3");

        Assertions.assertEquals(actual, result);

    }
}