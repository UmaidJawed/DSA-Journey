import java.util.Scanner;

public class Count_Digits {
    public static int countDigits(int n) {
        int lastdigit;
        int count = 0;
        int temp = n;

        if (temp == 0) {

            return 0;
        }

        while (temp != 0) {
            lastdigit = temp % 10;
            if (lastdigit != 0 && n % lastdigit == 0) {
                count++;
            }
            temp = temp / 10;

        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = countDigits(n);
        System.out.println(result);
    }
}
