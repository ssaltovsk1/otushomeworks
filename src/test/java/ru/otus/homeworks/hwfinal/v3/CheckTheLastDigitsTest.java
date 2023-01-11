package ru.otus.homeworks.hwfinal.v3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CheckTheLastDigitsTest {


@Test
    void checkIsTenAppearInData() {

    CheckTheLastDigits test = new CheckTheLastDigits();

    HashMap<Integer, String> mapToCheck = new HashMap<>();
    mapToCheck.put(0,"1");
    mapToCheck.put(1,"1");

    boolean expected = true;
    boolean actual = test.checkIsTenAppearInData(mapToCheck);

    Assertions.assertEquals(expected, actual);

}




}