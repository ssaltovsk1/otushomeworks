package ru.otus.homeworks.hw03;

import java.util.*;

public class SortingFunctionOneByOne {

    public static void main(String[] args) {

        SortingMethod toTest = new SortingMethod();

        ArrayList<Integer> arrayList = new ArrayList<>(randomNumberList(10000, 99));
        ArrayList<Integer> arrayListStandart = new ArrayList<>(randomNumberList(10000, 99));


        var startTime = System.nanoTime();
        toTest.finalSort(arrayList);
        var finishTime = System.nanoTime();


        var startTimeStandart = System.nanoTime();
        Collections.sort(arrayListStandart);
        var finishTimeStandart = System.nanoTime();

        System.out.println((finishTime - startTime) + " - время сортировки созданным алгоритмом");
        System.out.println((finishTimeStandart - startTimeStandart) + " - время сортировки стандартным алгоритмом");
    }

    private static ArrayList<Integer> randomNumberList(int arraySize, int arrayRange) {

        ArrayList<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            randomList.add(i, new Random().nextInt(arrayRange) + 1);
        }

        return randomList;
    }

    private static class SortingMethod {

        public static ArrayList<Integer> finalSort(ArrayList<Integer> arrayToSort) {
            int tempNumber = 0;
            int tempIndex = 0;
            for (int i = 0; i < arrayToSort.size(); i++) {
                tempIndex = arrayToSort.lastIndexOf(i);
                for (int j = 0; j < arrayToSort.size(); j++) {
                    if (arrayToSort.get(i) < arrayToSort.get(j)) {
                        Collections.swap(arrayToSort, i, j);
                    }
                }
                }

            return arrayToSort;
            }
        }
    }
