package sem2;

public class task3 {


    public static boolean compareArray(int[] arr) {
        int leftSum = 0;
        int rightSum;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            rightSum =0;
            for (int j = i + 1; j < arr.length; j++){
                rightSum += arr[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    public static void printBool(boolean bool){
        System.out.println(bool);
    }
}
