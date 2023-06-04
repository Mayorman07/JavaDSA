package Jazz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JazzMan {

    public static void main(String[] args) {
        System.out.println("Please enter the number of chords you wish to render");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        String[] chords = new String[input];
        for (int i = 0; i < chords.length; i++) {
            System.out.print("Enter a value for index " + i + ": ");
            chords[i] = sc.nextLine();
        }

        if (chords.length == 0) {
            System.out.print("[]");
        } else {
            String[] result = jazzify(chords);
            System.out.print(Arrays.toString(result));
        }
    }
    public static String[] jazzify(String[] chords) {

        List<String> jazzifiedChords = new ArrayList<>();

        for (String chord : chords) {
            if (chord.contains("7")) {
                jazzifiedChords.add(chord);
            } else {
                jazzifiedChords.add(chord + "7");
            }
        }
        return jazzifiedChords.toArray(new String[0]);
    }
}
