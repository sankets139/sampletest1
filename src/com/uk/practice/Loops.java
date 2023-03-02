package com.uk.practice;

public class Loops {

    // for loop - print 1 to 10

    private static void forLoop(int number){
        for (int i=0; i<= number; i++ ){
            System.out.println(i);
        }
    }

    private static void evenNumber(int number1){
        for (int i =1; i<=number1; i++){
            if (i%2 ==0){
                System.out.println("The number is even " + i);
            }
        }
    }

    // while loop - print 1 to 10

    private static void whileLoop(int number){
        int i =1;
        while (i<=number){
            if (i%2 ==0){
                System.out.println(i);
            }
            i++;
        }
    }

    // do while loop - print 1 to 10

    private static void doWhileLoop(int number2){
        int i = 0;
        do
        {
            if (i%2 == 0){

                System.out.println(i);
            }
            i++;

        }while (i<=number2);
    }

    public static void main(String[] args) {
        // forLoop(10);
        //evenNumber(20);
        doWhileLoop(20);

    }
}
