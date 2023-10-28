package sem2;

public class task3 {


    public static boolean compareArray(int[] arr) {
        int leftSum = arr[0];
        int rightSum = 0;
        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }
        if (leftSum == rightSum) return true;
        for (int j = 1; j < arr.length - 1; j++) {
            leftSum += arr[j];
            rightSum -= arr[j];
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    public static void printBool(boolean bool) {
        System.out.println(bool);
    }
}
