package NextLetters;

import java.util.Scanner;

public class Move {

    public static void main(String[]args){
        System.out.println("Please enter the text you wish to tweak");
        System.out.println("Please refrain from entering a Z in the text");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = moveLetter(input);
        System.out.println("Result: " + result);
        sc.close();

    }
    public static String moveLetter (String input){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<input.length();i++){
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)){
                if(currentChar == 'Z' || currentChar == 'z'){
                    System.out.println("But i told you na");
                    return null;
                } else{
                    char nextChar = (char)(currentChar + 1);
                    result.append(nextChar);
                }
            } else{
                System.out.println("Please enter a string as the input!!!!!");
                return null;
            }
        }
        return result.toString();
    }
}
