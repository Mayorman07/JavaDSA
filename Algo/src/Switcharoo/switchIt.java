package Switcharoo;

import java.util.Scanner;

public class switchIt{

    public static void main (String[]args) {
        System.out.println("Enter the text you wish to switch please");

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        //check the length of the string for validation leg one
        int length = userInput.length();

        if (length < 2) {
            System.out.println("Incompatible");
            return;
        }

        String flippedCharacters = flipEndChars(userInput);
        System.out.println("The flipped characters are : " + flippedCharacters);

    }
       public static String flipEndChars(String userInput){

            //declare character positions
            int length = userInput.length();
            char firstChar = userInput.charAt(0);
            System.out.println("The first character entered is : " + firstChar);

            char lastChar = userInput.charAt(length - 1);
            System.out.println("The last character entered is : " + lastChar);


            //check if the first and last characters are the same - validation leg two

            if(firstChar == lastChar){
                System.out.println("Two's a pair!!");
                return userInput;
            }
            else{
                char temporaryChar = firstChar;
                firstChar = lastChar;
                lastChar =  temporaryChar;
            }
            // Return the modified string
            return firstChar + userInput.substring(1, length - 1) + lastChar;
        }
    }

