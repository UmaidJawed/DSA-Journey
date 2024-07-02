package Arrays;

import java.util.Arrays;

public class Intersection_Of_TwoArrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        int arr[] = new int[1001];
        int result[] = new int[1001];

        // Storing the frequency of the element inside the arr[] using nums1 elements
        for (int num : nums1) {
            arr[num]++; // Incrementing the value by 1 for each element
        }

        int counter = 0;
        for (int num : nums2) {
            if (arr[num] > 0) {
                result[counter++] = num;
                arr[num]--; // Making the frequency of the element decrement by 1 so that it would mark
                            // position of the element as visited by storing that element in the result
                            // array.
            }
        }

        // Using this copyOfRange function so that we can store the values which we get
        // by doing intersection and avoiding the other remaining elements which is of
        // no use . As we can see that our size of array is till 1001.If we dont use
        // this function and simply return the result array then it will also print
        // output along with the rest elements i.e, 0 till the size of 1001.
        return Arrays.copyOfRange(result, 0, counter);
    }
}
