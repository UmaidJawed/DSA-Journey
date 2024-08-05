package Strings

public class Kth DistinctString_in_anArray
{

    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        // Storing the string character as a key with wth value based on its no. of
        // occurrence
        for (String x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Now incrementing the cound based on the unique value and then comaparing it
        // with k using '==' operaotr and then returning the string based on it
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                count++;
            }

            if (count == k) {
                return arr[i];
            }
        }
        return "";/// bydefault if there is no unique element exists then return "" empty string
    }
}