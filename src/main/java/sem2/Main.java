package sem2;

public class Main {
    public static void main(String[] args) {
        // ������ �������
        int[] arr = task1.createArray(5);
        task1.printResult(arr, task1.searchMinMax(arr));

        System.out.println(); // ����������� ����� ���������
        // ������ �������
        int[][] dArr = task2.createDoubleArray(5);
        task2.printDoubleArray(task2.fillArray(dArr));

        System.out.println(); // ����������� ����� ���������
        // ������ �������
        task3.printBool(task3.compareArray(new int[]{1, 1, 1, 2, 1}));
        task3.printBool(task3.compareArray(arr)); // ������������ ������ �� ������� �������
    }
}
