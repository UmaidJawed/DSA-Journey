package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Greatest_No_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum = 0;
        int n = candies.length;
        ArrayList<Boolean> result = new ArrayList<>();
        int max = candies[0];

        for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        // max = (Boolean)true;
        for (int i = 0; i < n; i++) {
            sum = candies[i] + extraCandies;
            if (sum >= max) {
                result.add(i, true);

            }

            else {

                result.add(i, false);
            }
        }

        return result;
    }
}
