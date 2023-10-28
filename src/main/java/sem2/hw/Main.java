package sem2.hw;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Создание и заполнение целочисленного массива случайной длины, случайными целыми числами
        Random random = new Random();
        int[] arr = new int[random.nextInt(2, 15)];
        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(5);

//        Задание 1.
        System.out.println("1. Написать метод, возвращающий количество чётных элементов массива." +
                "countEvens([2, 1, 2, 3, 4]) => 3 countEvens([2, 2, 0]) => 3 countEvens([1, 3, 5]) => 0");

        System.out.printf("%s количество чётных элементов => %d\n\n", Arrays.toString(arr), countEvens(arr));


//        Задание 2.
        System.out.println("2. Написать функцию, возвращающую разницу между самым большим и самым маленьким " +
                "элементами переданного не пустого массива.");
        System.out.printf("%s разница между максимальным и минимальным числами => %d\n\n", Arrays.toString(arr), differenceMinMax(arr));

//        Задание 3.
        System.out.println("3. Написать функцию, возвращающую истину, если в переданном массиве есть два " +
                "соседних элемента, с нулевым значением.");
        System.out.printf("%s есть ли два соседних 0? => %b", Arrays.toString(arr), doubleZero(arr));
    }


    /*
        Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    */
    public static int countEvens(int[] arr) {
        int countEvens = 0;
        for (int i : arr) {
            if (i % 2 == 0) countEvens += 1;
        }
        return countEvens;
    }

/*
    Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного
    не пустого массива.
*/

    public static int differenceMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        int diff = max - min;
        if (diff < 0) return diff * -1;
        return diff;
    }

    /*
        Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
    */
    public static boolean doubleZero(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) return true;
        }
        return false;
    }
}
