package src.WordLength;
import java.util.Scanner;

public class comparingWords {

    public static void main(String[] args){
        System.out.println("Dear user, please enter the sentence of your choice");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String longest = longestWord(input);{
            System.out.println("The longest word is : " + longest);
        }
    }
    public static String longestWord(String input){
        String [] sentence = input.split(" ");

        String lengthiestWord = "";
        int maxLength = 0;

        for (String word : sentence){

            if(word.length() > maxLength){
                maxLength = word.length();
                lengthiestWord = word;
            } else if (word.length() == maxLength && lengthiestWord.isEmpty()){
                lengthiestWord = word;
            }
        }
        return lengthiestWord;
    }
}
