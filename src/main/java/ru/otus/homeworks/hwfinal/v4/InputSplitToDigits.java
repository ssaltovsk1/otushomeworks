package ru.otus.homeworks.hwfinal.v4;

import java.util.Map;
import java.util.TreeMap;

public class InputSplitToDigits {

    TreeMap<Integer, String> mapWithSplitDigits;
    public Map<Integer, String> splitInputToDigits(int inputData) {

        mapWithSplitDigits = new TreeMap<>();
        int tempInteger, digitToAddToMap = 0;
        int counter = inputData;

        for (int i = 0; i < String.valueOf(counter).length(); i++){
            tempInteger = inputData;
            inputData = inputData / 10;
            digitToAddToMap = (int) ((tempInteger % 10) * Math.pow(10, i));
            if (i == 1 && digitToAddToMap == 10) {
                digitToAddToMap = digitToAddToMap + mapWithSplitDigits.firstKey();
                mapWithSplitDigits.put(digitToAddToMap, null);
                mapWithSplitDigits.remove(mapWithSplitDigits.firstKey());
            }
            mapWithSplitDigits.put(digitToAddToMap, null);
        }

        if (mapWithSplitDigits.firstKey() == 0) {
            mapWithSplitDigits.remove(0);
        }

        return mapWithSplitDigits;
    }
}
