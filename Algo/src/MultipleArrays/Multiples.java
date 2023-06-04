package MultipleArrays;

import java.util.Arrays;

public class Multiples {
    // declare a method that returns an array of integers for the required information
    public static int[] arrayOfMultiples(int num, int length) {
        int[] multiples = new int[length];

        // loop through the values of length starting from zero and incrementing till the value of length
        for (int i = 0; i < length; i++) {
            multiples[i] = num * (i + 1);
        }
        return multiples;
    }

    public static void main(String[] args) {
        // declaring the required parameters
        int num = 12;
        int length = 10;
        int[] result = arrayOfMultiples(num, length);

        // print the array of results
//        System.out.print("[");
//        for (int i = 0; i < length; i++) {
//            System.out.print(result[i]);
//            if (i < length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
        System.out.println(Arrays.toString(result));
    }
}
