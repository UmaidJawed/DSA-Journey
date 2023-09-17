package Recursion;

import java.util.*;

public class Print_from_One_to_N {
    public static int[] recur(int x, int[] arr) {
        if (x == 0)
            return arr;

        int index = x;
        arr[index - 1] = x;
        return recur(x - 1, arr);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print(recur(x, arr));
    }
}
