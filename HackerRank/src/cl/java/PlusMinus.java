package cl.java;

import java.util.Arrays;
import static java.util.stream.Collectors.toList;
import java.util.*;
import java.lang.Integer;

public class PlusMinus {
    public static void main(String[] args) {

       List <Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 0, -1 , -1));


        plusMinus(arr);

    }


    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int arrayDimension = arr.size();

        for (int i=0; i< arrayDimension; i++) {
            if (arr.get(i) == 0) {
                zeroCount++;

            } else if (arr.get(i) < 0) {
                negativeCount++;
            } else {
                positiveCount++;
            }
        }
        float proportionsPositive = (float) positiveCount / arrayDimension;
        float proportionsNegative = (float) negativeCount / arrayDimension;
        float proportionsZero = (float) zeroCount / arrayDimension;

        System.out.println(proportionsPositive);
        System.out.println(proportionsNegative);
        System.out.println(proportionsZero);


    }

}
