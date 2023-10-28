package sem2;

public class Main {
    public static void main(String[] args) {
        // Первое задание
        int[] arr = task1.createArray(5);
        task1.printResult(arr, task1.searchMinMax(arr));

        System.out.println(); // Разделитель между заданиями
        // Второе задание
        int[][] dArr = task2.createDoubleArray(5);
        task2.printDoubleArray(task2.fillArray(dArr));

        System.out.println(); // Разделитель между заданиями
        // Третье задание
        task3.printBool(task3.compareArray(new int[]{1, 1, 1, 2, 1}));
        task3.printBool(task3.compareArray(arr)); // сравнивается массив из первого задания
    }
}
