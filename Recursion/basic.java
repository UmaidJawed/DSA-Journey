package Recursion;

public class basic {
    int count = 0;
    /*
     * OR I can make count as a static variable inorder to make the function static
     * as well :
     * static int count = 0
     */

    public void recur() {// Here the function will be public static void recur()
        if (count == 3) {
            return;
        }
        System.out.println(count);
        count++;
        recur();
    }

    public static void main(String args[]) {
        basic obj = new basic();
        obj.recur();
    }
}
