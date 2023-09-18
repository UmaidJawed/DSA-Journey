package Recursion;

public class Palindrome_String {
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (j > i) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
