//package zjai_20march2025;
//
//import java.util.Arrays;
//
//public class setmatrixzero {
//    public static void main(String[] args) {
//        int[][] matrix = {{0, 1, 2, 0},
//                          {3, 4, 5, 8},
//                          {1, 3, 1, 9}};
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == 0) {
//
//                    for (int k = 0; k < matrix[0].length ; k++) { // row same column change = full row -1
//                        if (matrix[i][k]!=0){
//                        matrix[i][k]=-1;}
//                    }
//                    for (int n = 0; n < matrix.length ; n++) {// column same row change = full column  -1
//                        if (matrix[n][j]!=0){
//                        matrix[n][j]=-1;}
//                    }
//
//                }
//
//            }
//        }
//
//        System.out.println(Arrays.deepToString(matrix));
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == -1) {
//                matrix[i][j]=0;
//                }
//
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
//
//    }}


//                      optimised approach
package zjai_20march2025;

import java.util.Arrays;

public class setmatrixzero {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0},
                         {3, 4, 5, 8},
                        {1, 3, 1, 9}};

        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false, firstColZero = false;

        // Step 1: Check if first row or first column should be zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: Mark the rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark row
                    matrix[0][j] = 0; // Mark column
                }
            }
        }

        // Step 3: Zero out marked rows and columns
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
//                Arrays.fill(matrix[i], 0);
                for (int j = 0; j <n ; j++) {
                    matrix[i][j]=0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
//                Arrays.fill(matrix[j],0); it doesnot work for columns only for rows
            }
        }

        // Step 4: Handle first row and column separately
        if (firstRowZero) {
//            Arrays.fill(matrix[0], 0);
            for (int j = 0; j < n; j++) {
                matrix[0][j]=0;
            }
        }
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
