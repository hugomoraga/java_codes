package cl.java;

import java.util.ArrayList;

public class CompareTheTriplets {
    public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    ArrayList<Integer> result = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    b.add(4);
    b.add(5);
    b.add(6);

    result = compareTriplets(a, b);
    System.out.println(result);
    }

    public static ArrayList<Integer> compareTriplets(ArrayList<Integer> a, ArrayList<Integer> b){
        int aPoints = 0;
        int bPoints = 0;

        for (int i = 0; i <3 ; i++){
            if (a.get(i) > b.get(i)) {
                aPoints++;
            }
            else if (b.get(i) > a.get(i)) {
                bPoints++;
            }

        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(aPoints);
        result.add(bPoints);
        return result;
    }

}
