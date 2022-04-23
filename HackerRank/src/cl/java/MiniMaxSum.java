package cl.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(7,69,2,221,8974));

        miniMaxSum(arr);

    }

    public static void miniMaxSum(List<Integer> arr) {
        int arrayDimension = arr.size();

        // CREA ARRAYS
        List<Integer> maxSum = new ArrayList<>();
        List<Integer> miniSum = new ArrayList<>();

        // AGREGA DATA DEL ARRAY CALLBACK
        maxSum.addAll(arr);
        miniSum.addAll(arr);

        // ENCUENTRA EN MIN Y MAX VALUE

        int maxValue = arr.get(0);
        int minValue = arr.get(0);
        for (int i=1; i<arr.size(); i++){
            if(arr.get(i) > maxValue)
            {
                maxValue = arr.get(i);
            } else if (arr.get(i) < maxValue) {
                minValue = arr.get(i);
            }
        }
        // ELIMINA EL MIN Y EL MAX AL ARRAY
        maxSum.remove(Integer.valueOf(minValue));
        miniSum.remove(Integer.valueOf(maxValue));

        // SUMA VALORES
        int maxSumCount = 0;
        int miniSumCount = 0;
        for (int i = 0; i < arrayDimension-1; i++)
        {
         maxSumCount += maxSum.get(i);
         miniSumCount += miniSum.get(i);
        }

        System.out.print(miniSumCount);
        System.out.print(" ");
        System.out.print(maxSumCount);

    }

}
