package com.uk.practice;

public class Array {

    public static void main(String[] args) {

        // Create single dimensions String Array
        String[] strArray = new String[5];
        strArray[0] = "Rama";
        strArray[1] = "Sanket";
        strArray[2] = "Java";
        strArray[3] = "India";
        strArray[4] = "Test";


        //Create integer array
        Integer[] intArray = {1,2,3,4,5};
        System.out.println(intArray.length);
        for (int i =0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        System.out.println("-------------------------");

        for (int i=0;i< strArray.length;i++){
            System.out.println("Value of Array: " + strArray[i]);
        }

//        for (String arr:strArray
//             ) {
//            System.out.println(arr);
//        }
    }

}
