package Recursion;

import java.util.Scanner;

public class Printing_Names {

    public static void display(int n) {
        if (n == 1) {
            System.out.print("Coding Ninjas");
            return;
        }
        System.out.print("Coding Ninjas" + " ");
        display(n - 1);
    }

    public static void printNtimes(int n) {
        display(n);
    }
}
