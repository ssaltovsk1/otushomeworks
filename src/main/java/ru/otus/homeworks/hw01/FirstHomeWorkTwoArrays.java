// разбить отдельно вопросы и варианты ответов в отдельных массивах
// правильные ответы дать цифрами, приммитивами


package ru.otus.homeworks.hw01;

import java.util.Scanner;

public class FirstHomeWorkTwoArrays {
    public static void main(String[] args) {

        System.out.println("Приступим к тестированию \nДля выбора ответа - нажмите номер ответа и Enter \nДля выхода наберите exit и нажмите Enter");

        Scanner scanner = new Scanner(System.in);

        String questionFirst = "В чем смысл жизни \n1. Не знаю \n2. 42 \n3. А что такое \"Жизнь\"";
        String questionSecond = "\nС чего начинается река? \n1. С ручейка \n2. Капли дождя \n3. Не скажу";
        String questionThird = "\nПочему дует ветер \n1. Потому-что деревья качаются \n2. Переды давления \n3. Ветер относительно чего?";

        String[] arrayQuestions = {questionFirst, questionSecond, questionThird};

        int[][] arrayAnswers = {{1, 3, 1},
                {3, 1, 1},
                {1, 1, 3}};


        for (int i = 0; i < arrayQuestions.length; i++) {
            System.out.println(arrayQuestions[i]);
            String answer = scanner.nextLine();



            if (answer.toLowerCase().trim().equals("exit")) {
                System.out.println("До свидания");
                break;
            }
            else if (answer.chars().allMatch(Character::isLetter)) {
                System.out.println("Не правильно");
            }
                else if (1 >= Integer.parseInt(answer) || Integer.parseInt(answer) <= 3) {
                if (arrayAnswers[i][(Integer.parseInt(answer) - 1)] == 3) {
                    System.out.println("Правильно");
            }
                else System.out.println("Не правильно");

            }

            }
        }
    }

