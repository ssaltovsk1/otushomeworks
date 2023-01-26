package ru.otus.homeworks.hwfinal.v4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class InputSplitToDigitsTest {

    private final TreeMap<Integer, String> expectedMap = new TreeMap<>();

    @Test
    void splitInputToDigits() {



        int numbersForInput = 123;
        expectedMap.put(3, null);
        expectedMap.put(20, null);
        expectedMap.put(100, null);

        InputSplitToDigits inputSplitToDigits = new InputSplitToDigits();

        Assertions.assertEquals(expectedMap,inputSplitToDigits.splitInputToDigits(numbersForInput));

    }
}