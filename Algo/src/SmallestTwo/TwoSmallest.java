package src.SmallestTwo;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSmallest {

    public static void main(String[] args) {
        System.out.println("Please enter the number of digits you want to work with");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] numbers = new int[input];
        System.out.println("Kindly enter the" + input + " digits of your choice");

        for (int i = 0; i < input; i++) {
            System.out.print("Digit " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        sumTwoSmallestNum(numbers);
    }

    public static void sumTwoSmallestNum(int[] numbers) {
        Arrays.sort(numbers);
        int lowestPositiveOne = 0;
        int lowestPositiveTwo = 0;

        for (int number : numbers) {
            if (number > 0) {
                if (lowestPositiveOne == 0) {
                    lowestPositiveOne = number;
                } else if (lowestPositiveTwo == 0) {
                    lowestPositiveTwo = number;
                    break;
                }
            }
        }

        if (lowestPositiveOne == 0 || lowestPositiveTwo == 0) {
            System.out.println("You do not have enough positive digits to make this addition");
        } else {
            int sum = lowestPositiveOne + lowestPositiveTwo;
            System.out.println("The result is: " + sum);
        }
    }
}
