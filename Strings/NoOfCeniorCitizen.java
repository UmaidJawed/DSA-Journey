package Strings;

public class NoOfCeniorCitizen {
    public int countSeniors(String[] details) {
        int n = details.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int age = (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0');

            if (age > 60) {
                count++;
            }
        }

        return count;
    }
}
