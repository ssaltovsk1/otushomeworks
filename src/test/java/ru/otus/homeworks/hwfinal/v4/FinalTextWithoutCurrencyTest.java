package ru.otus.homeworks.hwfinal.v4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class FinalTextWithoutCurrencyTest {


    final private Map<Integer, String> getMapToBuildPhrase = new TreeMap<>();
    final private Map<Integer, String> mapBaseWithIntegersToString = new HashMap<>();
    @Test
    void buildPhraseFromIntegerMap() {
        getMapToBuildPhrase.put(1, null);
        getMapToBuildPhrase.put(20, null);

        mapBaseWithIntegersToString.put(1, "один");
        mapBaseWithIntegersToString.put(20, "двадцать");

        FinalTextWithoutCurrency finalTextWithoutCurrency = new FinalTextWithoutCurrency();
        String result = finalTextWithoutCurrency.buildPhraseFromIntegerMap(getMapToBuildPhrase, mapBaseWithIntegersToString);

        String expected = "двадцать один ";

        Assertions.assertEquals(expected, result);
    }
}