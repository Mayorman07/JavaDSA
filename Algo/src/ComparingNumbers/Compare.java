package src.ComparingNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {
        System.out.println("Please enter the number you wish to evaluate");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        oddsVsEvens(input);
    }

    public static int oddsVsEvens(int input) {
        // Convert the inputted number into a string
        String numbersInString = Integer.toString(input);
        // Create an array to hold an equivalent number of strings
        int[] digits = new int[numbersInString.length()];
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        //initializing even and odd number variables
        int sumOfEven = 0;
        int sumOfOdd = 0;

        // Convert each character of the string to an integer digit
        for (int i = 0; i < numbersInString.length(); i++) {
            digits[i] = Character.getNumericValue(numbersInString.charAt(i));

            // Check for even
            if (digits[i] % 2 == 0) {
                evenNumbers.add(digits[i]);
            } else {
                oddNumbers.add(digits[i]);
            }
        }

        for (int evenNumber : evenNumbers) {
            sumOfEven += evenNumber;
        }

        for (int oddNumber : oddNumbers) {
            sumOfOdd += oddNumber;
        }

        if (sumOfEven > sumOfOdd) {
            System.out.println("even");
        } else if (sumOfEven < sumOfOdd) {
            System.out.println("odd");
        } else {
            System.out.println("equal");
        }

        return input;
    }
}
