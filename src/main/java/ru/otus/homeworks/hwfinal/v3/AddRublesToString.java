package ru.otus.homeworks.hwfinal.v3;

public class AddRublesToString {

    public static String addCurrencyToText(String textInIntegers, String textToAddRubles) {

        String finalStringWithRubles = "";

        if (textInIntegers.substring((textInIntegers.length() - 2), textInIntegers.length()).matches("1[1-9]")) {
            finalStringWithRubles = textToAddRubles + "рублей";
        }
        else if (textInIntegers.substring((textInIntegers.length() - 1), textInIntegers.length()).matches("[234]")) {
            finalStringWithRubles = textToAddRubles + "рубля";
        } else if (textInIntegers.substring((textInIntegers.length() - 1), textInIntegers.length()).matches("[056789]")) {
            finalStringWithRubles = textToAddRubles + "рублей";
        }
        else if (textInIntegers.substring((textInIntegers.length() - 1), textInIntegers.length()).matches("1")) {
            finalStringWithRubles = textToAddRubles + "рубль";
        }

        // почему-то не работает этот Regex
//        if (textInIntegers.matches("[234]$")) {
//            finalStringWithRubles = textToAddRubles + " рубля";
//
//        } else if (textInIntegers.matches("[056789]$")) {
//            finalStringWithRubles = textToAddRubles + " рублей";
//
//        }
//        else if (textInIntegers.matches("1[1-9]$")) {
//            finalStringWithRubles = textToAddRubles + " рублей";
//
//        } else if (textInIntegers.matches("1$")) {
//            finalStringWithRubles = textToAddRubles + " рубль";
//
//        }

        return finalStringWithRubles;
    }

}
