package ru.otus.homeworks.hwfinal.v3;

import java.util.HashMap;
import java.util.Map;

import static ru.otus.homeworks.hwfinal.v3.CheckTheLastDigits.checkIsTenAppearInData;
import static ru.otus.homeworks.hwfinal.v3.IntegerToTextBaseInfo.mapInitialization;
import static ru.otus.homeworks.hwfinal.v3.ConvertIntegerToString.*;
import static ru.otus.homeworks.hwfinal.v3.DataInput.getInputData;
import static ru.otus.homeworks.hwfinal.v3.Main.mapWithInputData;

public class BuildPhrase {

    public static String buildPhraseFromMap(Map<Integer, String> mapToBuildPhrase) {

        String finalString = "";

        if (checkIsTenAppearInData(mapToBuildPhrase)) {
            for (Map.Entry<Integer, String> entry : mapToBuildPhrase.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                if (key > 1 && value.matches("[^1-9]+")) {
                    finalString = mapInitialization().get(value) + " " + finalString;
                } else if (key == 1) {
                    finalString = mapInitialization().get(value) + " " + finalString;
                }
            }

        } else {
            for (Map.Entry<Integer, String> entry : mapToBuildPhrase.entrySet()) {
                String value = entry.getValue();
                if (value.matches("[^1-9]+")) {
                    finalString = finalString;
                } else {
                    finalString = mapInitialization().get(value) + " " + finalString;
                }
            }
        }

        return finalString;
    }
}
