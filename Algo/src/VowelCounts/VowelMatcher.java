package VowelCounts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelMatcher {

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        firstNVowels(input, number);
    }
    public static void firstNVowels(String input, int number) {

        //declare a stringbuilder object to contain the string that will be built
        StringBuilder firstNVowels = new StringBuilder();
        int vowelCount = 0;
        //declare the regex
        String regex = "[aeiou]";

        //compile the regex that is built to a pattern object
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find() && firstNVowels.length() < number) {
            String vowels = matcher.group();
            firstNVowels.append(vowels);
            vowelCount++;
        }

        if (number > vowelCount) {
            System.out.println("An invalid count was entered.");
        } else {
            System.out.println("The first " + number + " vowels are: " + firstNVowels);
        }
    }
}


