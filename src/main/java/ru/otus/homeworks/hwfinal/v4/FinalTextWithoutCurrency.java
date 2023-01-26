package ru.otus.homeworks.hwfinal.v4;

import java.util.Map;

//import static ru.otus.homeworks.hwfinal.v3.IntegerToTextDataBase.mapInitialization;
//import static ru.otus.homeworks.hwfinal.v3.LastDigitChecker.checkIsTenAppearInData;

public class FinalTextWithoutCurrency {

    public static String buildPhraseFromIntegerMap(Map<Integer, String> mapToBuildPhrase, Map<Integer, String> mapBaseWithIntegersToString) {

        String finalString = "";

        for (Integer key: mapToBuildPhrase.keySet()) {
            if (mapBaseWithIntegersToString.containsKey(key)) {
                finalString = mapBaseWithIntegersToString.get(key) + " " + finalString;
            }
        }
        return finalString;
    }
}