package _00_Basics.JavaConcepts;

import java.util.Scanner;

public class ReadKeyboardSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateSum(sc);
        sc.close();
    }

    public static void calculateSum(Scanner sc) {
        int count = readValidInt(sc, "Enter number of integers you want to add: ");

        int sum = 0;
        int i = 1;
        while (i <= count) {
            int num = readValidInt(sc, "Enter integer " + i + ": ");
            sum += num;
            i++;
        }

        System.out.println("Sum of " + count + " entered numbers is: " + sum);
    }

    // Handles prompting + validating + reading a single valid int
    public static int readValidInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            sc.nextLine(); // discard invalid token
        }
        return sc.nextInt();
    }
}