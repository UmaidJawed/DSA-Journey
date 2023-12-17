package Pattern_Questions;

//Increasing Number Triangle Pattern
public class Pattern13 {
    public static void nNumberTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count += 1;

            }
            System.out.println();
        }
    }
}
