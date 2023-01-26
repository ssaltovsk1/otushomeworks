package ru.otus.homeworks.hwfinal.v4;

import java.util.HashMap;
import java.util.Map;

public class BaseWithIntegerToStringRelationship {
    static private Map<Integer, String> mapIntegerToStringBase;
    public static Map<Integer, String> mapInitialization() {

        mapIntegerToStringBase = new HashMap<>();

        mapIntegerToStringBase.put(0, "ноль");
        mapIntegerToStringBase.put(1, "один");
        mapIntegerToStringBase.put(2, "два");
        mapIntegerToStringBase.put(3, "три");
        mapIntegerToStringBase.put(4, "четыре");
        mapIntegerToStringBase.put(5, "пять");
        mapIntegerToStringBase.put(6, "шесть");
        mapIntegerToStringBase.put(7, "семь");
        mapIntegerToStringBase.put(8, "восемь");
        mapIntegerToStringBase.put(9, "девять");
        mapIntegerToStringBase.put(10, "десять");
        mapIntegerToStringBase.put(11, "одинадцать");
        mapIntegerToStringBase.put(12, "двенадцать");
        mapIntegerToStringBase.put(13, "тринадцать");
        mapIntegerToStringBase.put(14, "четырнадцать");
        mapIntegerToStringBase.put(15, "пятнадацать");
        mapIntegerToStringBase.put(20, "двадцать");
        mapIntegerToStringBase.put(30, "тридцать");
        mapIntegerToStringBase.put(40, "сорок");
        mapIntegerToStringBase.put(100, "сто");
        mapIntegerToStringBase.put(200, "двести");
        mapIntegerToStringBase.put(300, "триста");
        mapIntegerToStringBase.put(400, "четыреста");
        mapIntegerToStringBase.put(1000, "одна тысяча");
        mapIntegerToStringBase.put(2000, "две тысячи");
        mapIntegerToStringBase.put(3000, "три тысячи");
        mapIntegerToStringBase.put(4000, "четыре тысячи");

        return mapIntegerToStringBase;
    }
}