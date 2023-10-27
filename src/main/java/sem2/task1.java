package sem2;

import java.util.Random;

public class task1 {
    /*Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;*/

    /*
     * Метод возвращает одномерный целочисленный массив, заполненный случайными целыми числами.
     * В виде аргумента передается целое число - количество элементов массива.
     */
    public static int[] createArray(int count) {
        int[] arr = new int[count];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 16);
        }
        return arr;
    }

    /*
     * Метод принимает на вход целочисленный одномерный массив, и возвращает целочисленный массив вида [min, max]
     */
    public static int[] searchMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    /*
    * Метод предназначен для форматированного вывода в консоль исходного массива, и его min и max значений.
    */
    public static void printResult(int[] arr, int[] result) {
        System.out.print("В массиве: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) System.out.print(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
        System.out.printf("], минимальный элемент - %d, максимальный элемент - %d. \n", result[0], result[1]);
    }
}
