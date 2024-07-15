package Binary_Search;

import java.util.Scanner;

public class NoOfTimes_SortedArraysRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Rotated(arr, n));
    }

    static int Rotated(int arr[], int n) {
        int ans = 0;
        int low = 0, high = n - 1;

        while (low <= high) {
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }

        }
        return 0;
    }
}