package ru.otus.homeworks.hwfinal.v4;

import java.util.TreeMap;


import static ru.otus.homeworks.hwfinal.v4.Input.getInputData;

public class Main {
    private static int inputData;

    public static void main(String[] args) {

        inputData = getInputData();

        InputSplitToDigits inputSplitToDigits = new InputSplitToDigits();
        CreatedCurrencyTextImpl createdCurrencyText = new CreatedCurrencyTextImpl();

        TreeMap<Integer, String> mapInputDataSplitToDigits = new TreeMap<>(inputSplitToDigits.splitInputToDigits(inputData));

        String inputDigitsConvertedToString = FinalTextWithoutCurrency.buildPhraseFromIntegerMap(inputSplitToDigits.splitInputToDigits(inputData), BaseWithIntegerToStringRelationship.mapInitialization());
        String currencyText = createdCurrencyText.addCurrencyToText(mapInputDataSplitToDigits);

        System.out.println("Сумма прописью:\n" + inputDigitsConvertedToString + currencyText);

    }
}
