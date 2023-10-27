package sem2;

public class task2 {

    /*
     * ������� ���������� ������������� ������ (���������� ����� � �������� ����������)
     * ��������� ��� ������������ �������� ���������, ��������� ����(�)
     */

    /*
     * ����� ��� �������� ����������, �����������, �������������� ������� �������� �����������
     * */
    public static int[][] createDoubleArray(int count) {
        return new int[count][count];
    }

    /*
     * ������ ��� ���������� ���������� ���������� ������� ���������
     */
    public static int[][] fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        return arr;
    }

    /*
     * ����� ��� ���������������� ������ ���������� �������
     */
    public static void printDoubleArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
