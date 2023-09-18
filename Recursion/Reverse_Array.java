package Recursion;

public class Reverse_Array {
    public static int[] reverseArray(int n, int[] nums) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[n - 1 - i];
        }
        return arr;

    }
}