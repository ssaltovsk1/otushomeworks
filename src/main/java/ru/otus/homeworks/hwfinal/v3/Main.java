package ru.otus.homeworks.hwfinal.v3;

import java.util.HashMap;
import java.util.Map;


import static ru.otus.homeworks.hwfinal.v3.AddRublesToString.addCurrencyToText;
import static ru.otus.homeworks.hwfinal.v3.BuildPhrase.buildPhraseFromMap;
import static ru.otus.homeworks.hwfinal.v3.CheckTheLastDigits.checkIsTenAppearInData;
import static ru.otus.homeworks.hwfinal.v3.ConvertIntegerToString.*;
import static ru.otus.homeworks.hwfinal.v3.DataInput.getInputData;

public class Main {

    static public Map<Integer, String> mapWithInputData = new HashMap<>();


    public static void main(String[] args) {

        String inputData = getInputData();
        convertIntegerToStringSaveToMap(inputData);

        if (checkIsTenAppearInData(mapWithInputData)) {
            addCategoryOfIntegersWithTen(mapWithInputData);
        } else {
            addCategoryOfIntegers(mapWithInputData);
        }

        System.out.println(addCurrencyToText(inputData, buildPhraseFromMap(mapWithInputData)));
    }

    public static Map<Integer, String> convertIntegerToStringSaveToMap(String dataToConvert) {

        String dataToConvertWithoutNull = dataToConvert.replaceFirst("^0+(?!$)", "");

        for (int i = 0; dataToConvertWithoutNull.length() > i ; i++) {
            mapWithInputData.put(i, String.valueOf(dataToConvertWithoutNull.charAt(dataToConvertWithoutNull.length() - 1 - i)));
        }
        return mapWithInputData;
    }


}
