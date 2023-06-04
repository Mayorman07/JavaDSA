package src.RandomNumber;

import java.util.Arrays;
import java.util.Random;

public class RandomValue {

    public static void main(String[]args){
        int [] randomArrays = getRandomNumber(10);
        System.out.println(Arrays.toString(randomArrays));
        Arrays.sort(randomArrays);
        System.out.println(Arrays.toString(randomArrays));
        Arrays.sort(randomArrays);
        System.out.println(Arrays.toString(randomArrays));

    }

    private static int[]getRandomNumber(int length){

      Random random = new Random();
        int [] newInt = new int [length];

        for (int i = 0; i< length; i++){
            newInt[i] = random.nextInt(200);
        }
        return newInt;
    }
}

