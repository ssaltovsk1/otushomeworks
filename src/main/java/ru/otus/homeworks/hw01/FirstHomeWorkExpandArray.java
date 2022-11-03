package ru.otus.homeworks.hw01;

import java.util.Arrays;

public class FirstHomeWorkExpandArray {
    public static void main(String[] args) {
        int [] arr = {1, 21};
        System.out.println("Длинна массива - " + arr.length);
        System.out.println(arr[0] + " " + arr[1]);
        arr = Arrays.copyOf(arr, 3);
        arr[2] = 33;
        System.out.println("Длинна массива - " + arr.length);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}