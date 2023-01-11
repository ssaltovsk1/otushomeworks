package ru.otus.homeworks.hwfinal.v3;

import java.util.HashMap;

public class IntegerToTextBaseInfo {

    public static HashMap<String, String> mapInitialization() {

        HashMap<String, String> infoMap = new HashMap<>();

        infoMap.put("0", "ноль");
        infoMap.put("1", "один");
        infoMap.put("2", "два");
        infoMap.put("3", "три");
        infoMap.put("4", "четыре");
        infoMap.put("5", "пять");
        infoMap.put("6", "шесть");
        infoMap.put("7", "семь");
        infoMap.put("8", "восемь");
        infoMap.put("9", "девять");
        infoMap.put("10", "десять");
        infoMap.put("11", "одинадцать");
        infoMap.put("12", "двенадцать");
        infoMap.put("13", "тринадцать");
        infoMap.put("14", "четырнадцать");
        infoMap.put("15", "пятнадацать");
        infoMap.put("20", "двадцать");
        infoMap.put("30", "тридцать");
        infoMap.put("100", "сто");
        infoMap.put("200", "двести");
        infoMap.put("300", "триста");
        infoMap.put("400", "четыреста");
        infoMap.put("1000", "одна тысяча");

        return infoMap;
    }
}