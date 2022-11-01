package ru.otus.homeworks.hw01;



import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {

        System.out.println("Приступим к тестированию \nДля выбора ответа - нажмите номер ответа и Enter \nДля выхода наберите exit и нажмите Enter");

        Scanner scanner = new Scanner(System.in);

        String questionFirst = "В чем смысл жизни \n1. Не знаю \n2. 42 \n3. А что такое \"Жизнь\"";
        String questionSecond = "\nС чего начинается река? \n1. С ручейка \n2. Капли дождя \n3. Не скажу";
        String questionThird = "\nПочему дует ветер \n1. Потому-что деревья качаются \n2. Переды давления \n3. Ветер относительно чего?";
        String[][] matrix = {{questionFirst, "A", "A", "B"},
                {questionSecond, "A", "B", "A"},
                {questionThird, "A", "B", "A"}};

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][0]);
            String answer = scanner.nextLine();
            // int answer = scanner.nextInt();

            if (answer.toLowerCase().trim().equals("exit")) {
                System.out.println("До свидания");
                break;
            } else if ((matrix[i][Integer.parseInt(answer)]).equals("B")) {
                System.out.println("Правильно");
            } else if ((matrix[i][Integer.parseInt(answer)]).equals("A")) {
                System.out.println("Не правильно");
            }
        }
    }
}