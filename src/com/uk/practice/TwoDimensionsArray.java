package com.uk.practice;

public class TwoDimensionsArray {
/*    public static void main(String[] args) {
        Integer[][] intArray = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i<intArray.length;i++){
            for (int j=0; j<intArray[i].length;j++){
                System.out.print(intArray[i][j]);
            }
            System.out.println();
        }
    }*/

    //  print pattern

    public static void main(String[] args) {

        // first for loop counts number of rows

        for (int i = 1; i <= 7; i++) {

            // second for loop counts numbers to print on that row

            for (int j = 1; j <= i; j++) {
                System.out.print(j); //1 12 123 1234 .... 1234567
            }
            System.out.println(" ");
        }
    }

}
