package cl.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        int n = 3;
        List<Integer> arrayListA = new ArrayList<>(Arrays.asList(11, 2, 4));
        List<Integer> arrayListB = new ArrayList<>(Arrays.asList(4, 5, 86));
        List<Integer> arrayListC = new ArrayList<>(Arrays.asList(10, 9, -12));

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(arrayListA);
        arr.add(arrayListB);
        arr.add(arrayListC);
        System.out.println(arr);

        int result = diagonalDifference(arr);
        System.out.println(result);

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<arr.size(); i++){
            for (int j=0; j< arr.size(); j++) {
                if (i == j) {
                    sum1 += arr.get(i).get(j);
                }

            }
        }
        int lastPosition = arr.size() -1;
        for (int i=0; i<arr.size(); i++){
            for (int j=0; j< arr.size(); j++) {
                if (i == j) {
                    sum2 += arr.get(i).get(lastPosition - j);
                }
            }
        }
        int result = sum1 - sum2;

        return Math.abs(result);
    }

}
