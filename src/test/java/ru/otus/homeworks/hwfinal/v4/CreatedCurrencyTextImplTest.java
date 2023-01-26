package ru.otus.homeworks.hwfinal.v4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class CreatedCurrencyTextImplTest {

    private final TreeMap<Integer, String> mapWithData = new TreeMap<>();
    private final String expectedString = "рубль";
    @Test
    void addCurrencyToText() {

        mapWithData.put(1, "один");

        CreatedCurrencyTextImpl createdCurrencyText = new CreatedCurrencyTextImpl();
        String result = createdCurrencyText.addCurrencyToText(mapWithData);

        Assertions.assertEquals(expectedString, result);

    }
}