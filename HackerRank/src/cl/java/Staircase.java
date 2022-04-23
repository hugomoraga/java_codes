package cl.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Staircase {
    public static void main(String[] args) {

        int n = 3;
        staircase(n);

    }
    public static void staircase(int n) {

        int row = n;
        int col = n;

        String[][] matrix = new String[row][col];

        String staircase = "#";
        // CREATE MATRIX
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = staircase;
            }
        }

        // MOD MATRIX
        String space = " ";
        for(int i=0;i<row;i++){
            for(int j=1;j<=col;j++){
                if (j<n-i) {
                    matrix[i][j - 1] = space;
                }
            }
        }

        //DISPLAY MATRIX MOD
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

}
