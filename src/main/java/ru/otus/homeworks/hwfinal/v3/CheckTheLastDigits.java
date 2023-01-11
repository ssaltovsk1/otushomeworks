package ru.otus.homeworks.hwfinal.v3;

import java.util.Map;

public class CheckTheLastDigits {

    public static boolean checkIsTenAppearInData(Map<Integer, String> mapToCheck) {

        if (mapToCheck.containsKey(1)) {
            return mapToCheck.get(1).contains("1");
        }
        return false;
    }

}
