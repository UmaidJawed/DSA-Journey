package Sorting;

public class QS {
    public static int partition(int arr[], int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int i = startIndex;
        int j = endIndex;

        while (i < j) {
            while (arr[i] <= pivot && i <= endIndex - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= startIndex + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[startIndex];
        arr[startIndex] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void qs(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pIndex = partition(arr, startIndex, endIndex);
            qs(arr, startIndex, pIndex - 1);
            qs(arr, pIndex + 1, endIndex);
        }
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (input == null || startIndex < 0 || endIndex >= input.length || startIndex >= endIndex) {
            return;
        }
        qs(input, 0, endIndex);

    }
}
