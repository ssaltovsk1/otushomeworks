package ru.otus.homeworks.hwfinal.v3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.homeworks.hwfinal.v3.ConvertIntegerToString;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ConvertIntegerToStringTest {

    ConvertIntegerToString convertIntegerToStringTest = new ConvertIntegerToString();
    private static Map<Integer, String> mapWithoutTenInTheEnd = new HashMap<>();
    private static Map<Integer, String> mapWithTenInTheEnd = new HashMap<>();
    @Test
    void addCategoryOfIntegers() {
        mapWithoutTenInTheEnd.put(0,"1");
        mapWithoutTenInTheEnd.put(1,"3");
        mapWithoutTenInTheEnd.put(2,"2");

        convertIntegerToStringTest.addCategoryOfIntegers(mapWithoutTenInTheEnd);

        Map<Integer, String> expectedMap = new HashMap<>();
        expectedMap.put(0,"1");
        expectedMap.put(1,"30");
        expectedMap.put(2,"200");

        Assertions.assertEquals(expectedMap, mapWithoutTenInTheEnd);

    }

    @Test
    void addCategoryOfIntegersWithTen() {

        mapWithTenInTheEnd.put(0,"2");
        mapWithTenInTheEnd.put(1,"1");
        mapWithTenInTheEnd.put(2,"3");

        convertIntegerToStringTest.addCategoryOfIntegersWithTen(mapWithTenInTheEnd);

        Map<Integer, String> expectedMap = new HashMap<>();
        expectedMap.put(0,"2");
        expectedMap.put(1,"12");
        expectedMap.put(2,"300");

        Assertions.assertEquals(expectedMap, mapWithTenInTheEnd);

    }
}