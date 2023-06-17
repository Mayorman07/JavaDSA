package src.SmallestMultiple;

import java.util.Scanner;

public class SmallestNDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits you want the multiple to have:");
        int range = sc.nextInt();
        System.out.println("Enter the number you want to obtain multiples of:");
        int number = sc.nextInt();

        int result = smallest(range, number);
        System.out.println("The result is: " + result);
    }

    public static int smallest(int range, int number) {
        int smallestMultiple = 0;
        int counter = 1;

        while (String.valueOf(smallestMultiple).length() < range) {
            smallestMultiple = number * counter;
            counter++;
        }

        return smallestMultiple;
    }
}