package cl.java;
import java.math.*;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        ArrayList<Long> ar = new ArrayList<>();
        ar.add(1000000001L);
        ar.add(1000000002L);
        ar.add(1000000003L);

        long result = aVeryBigSum(ar);
        System.out.println(result);

    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        int n = ar.size();
        long bigSum = 0;
        for (int i = 0; i<n; i++){
            bigSum += ar.get(i);
        }
        return bigSum;
    }

}
