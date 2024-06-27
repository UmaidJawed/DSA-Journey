package Binary_Search;

public class FindNumberOf_Rotation_InSortedArray {
    int findKRotation(int arr[], int n) {
        n = arr.length;
        int start = 0, end = n - 1;
        int next = 0, prev = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            next = (mid + 1) % n;
            prev = (mid + n - 1) % n;

            if (arr[start] <= arr[end])
                return start;

            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid;
            }

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }

            if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }

        return -1;
    }
}
