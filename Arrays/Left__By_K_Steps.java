package Arrays;

import java.util.ArrayList;

public class Left__By_K_Steps {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            temp.add(arr.get(i));
        }

        for (int i = k; i < n; i++) {
            arr.set(i - k, arr.get(i));
        }

        for (int i = n - k; i < n; i++) {
            arr.set(i, temp.get(i - (n - k)));
        }
        return arr;
    }
}
