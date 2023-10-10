package Arrays;

import java.util.ArrayList;

public class Move_Zeros_To_End {
    public static int[] moveZeros(int n, int[] a) {
        n = a.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp.add(a[i]);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            a[i] = temp.get(i);
        }

        int nz = temp.size();
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }

        return a;
    }
}
