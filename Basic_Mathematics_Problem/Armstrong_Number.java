import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += (rem * rem * rem);
            n = n / 10;
        }

        if (temp == sum)
            System.out.println("true");

        else
            System.out.println("false");
    }
}
