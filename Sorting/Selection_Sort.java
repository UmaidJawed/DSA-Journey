package Sorting;

import java.util.*;

public class Selection_Sort {
    public void sort(int arr[], int n) {

        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = 0; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Selection_Sort obj = new Selection_Sort();
        obj.sort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
