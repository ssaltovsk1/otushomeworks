package ru.otus.homeworks.hwfinal.v3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BuildPhraseTest {

    BuildPhrase toBuildPhrase = new BuildPhrase();
    @Test
    void buildPhraseFromMap() {
        HashMap<Integer, String> mapToCheck = new HashMap<>();
        mapToCheck.put(0, "3");
        mapToCheck.put(1, "20");
        mapToCheck.put(2, "100");

        String expected = "сто двадцать три ";
        String actual = toBuildPhrase.buildPhraseFromMap(mapToCheck);

        Assertions.assertEquals(expected, actual);

    }

}