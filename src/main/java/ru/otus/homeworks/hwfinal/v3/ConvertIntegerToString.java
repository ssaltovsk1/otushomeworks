package ru.otus.homeworks.hwfinal.v3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ru.otus.homeworks.hwfinal.v3.IntegerToTextBaseInfo.mapInitialization;

public class ConvertIntegerToString {
    private static Map<Integer, String> mapCopy;
    public static void addCategoryOfIntegers(Map<Integer, String> mapToAddZero) {

        mapCopy = mapToAddZero.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        for (Map.Entry<Integer, String> entry : mapCopy.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            mapToAddZero.put(key, value + "0".repeat(key));
        }
    }

        public static void addCategoryOfIntegersWithTen(Map<Integer, String> mapToAddZero) {
            Map<Integer, String> mapCopy;

            mapCopy = mapToAddZero.entrySet().stream()
                    .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

            for (Map.Entry<Integer, String> entry : mapCopy.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                mapToAddZero.put(key, value + "0".repeat(key));
            }
            mapToAddZero.put(1, "1" + mapToAddZero.get(0));
    }
}
