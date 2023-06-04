package Zip;

import java.util.Arrays;
import java.util.Scanner;

public class ZipIt {

    public static void main(String[] args) {

        //for women
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the women: ");
        int sizeWomen = sc.nextInt();
        sc.nextLine();

        String[] women = new String[sizeWomen];


        for (int i = 0; i < sizeWomen; i++) {
            System.out.print("Names of the females at index " + i + ": ");
            women[i] = sc.nextLine();
        }

        System.out.println("The entered female names are:");

        for (String woman : women) {
            System.out.println(woman);
        }


//for men

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of the men: ");
        int sizeMen = scan.nextInt();
        scan.nextLine();

        String[] men = new String[sizeMen];


        for (int i = 0; i < sizeMen; i++) {
            System.out.print("Names of the males at index " + i + ": ");
            men[i] = scan.nextLine();
        }

        System.out.println("The entered male names are:");

        for (String man : men) {
            System.out.println(man);
        }

        String[][] pairs = zipIt(women, men);


        for (String[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

    }


    public static String[][] zipIt(String[] women, String[] men) {

        if (women.length != men.length) {
            System.out.println("Null result");
            throw new IllegalArgumentException("A mismatched number of women and men was entered.");
        } else {
            String[][] pairs = new String[women.length][2];

            for (int i = 0; i < women.length; i++) {
                pairs[i][0] = women[i];
                pairs[i][1] = men[i];
            }
            return pairs;
        }

    }
}
