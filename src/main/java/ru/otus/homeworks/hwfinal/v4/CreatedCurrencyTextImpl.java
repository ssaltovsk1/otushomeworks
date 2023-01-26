package ru.otus.homeworks.hwfinal.v4;

import java.util.TreeMap;

public class CreatedCurrencyTextImpl implements CreateCurrencyText {

    @Override
    public String addCurrencyToText(TreeMap<Integer, String> inputMap) {

        String currencyText = "";

        if (inputMap.firstKey() == 1) {
            currencyText = "рубль";
        } else if (1 < inputMap.firstKey() && inputMap.firstKey() < 5) {
            currencyText = "рубля";
        } else {
            currencyText = "рублей";
        }
        return currencyText;
    }
}
