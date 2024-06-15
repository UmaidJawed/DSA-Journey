package Arrays;

import java.util.ArrayList;

public class Union_Of_Two_Arrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        n = arr1.length;
        m = arr2.length;

        int i = 0;
        int j = 0;
        ArrayList<Integer> unionArray = new ArrayList<Integer>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (unionArray.size() == 0 || unionArray.get(unionArray.size() - 1) != arr1[i]) {
                    unionArray.add(arr1[i]);
                }
                i++;

            }

            else {
                if (unionArray.size() == 0 || unionArray.get(unionArray.size() - 1) != arr2[j]) {
                    unionArray.add(arr2[j]);
                }
                j++;

            }
        }

        while (i < n) {
            if (unionArray.get(unionArray.size() - 1) != arr1[i]) {
                unionArray.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (unionArray.get(unionArray.size() - 1) != arr2[j]) {
                unionArray.add(arr2[j]);

            }
            j++;
        }

        return unionArray;
    }
}
