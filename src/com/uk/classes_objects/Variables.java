package com.uk.classes_objects;


import java.io.File;

public class Variables {

    /* Global variables - Declared outside of methods and constructors
                        - They can be used throughout the class

                          1.) Instance variables - non-static
                          2.) Class variables - static (Static variables must always declare globally)
     */

        //instance variables
        String str;
        HumanBeing ram;
        Employee karthik;
        int i = 0;
        File f1 = new File("readme.txt");


        //static variables (Class variables)
        static String str1;
        static HumanBeing tom;
        static int x;

    /* local variables - scope is limited to the method or constructor
        1.) variables are declared in a method / constructor
        2.) arguments passed to a method / constructor
     */

        int doSomething(int numTimes){
            karthik = new Employee();
            i =11;
            numTimes = 20; //local to method
            int j = 32; // local to method
            String strLocal = "Axone";
            return numTimes;
        }
        void doSomethingElse(){
            i=30;
            //numTimes =233; // not allowed as it is local to doSomething method
//        j=48; // not allowed as it is local to doSomething method
//        strLocal = "Dev In Test"; // not allowed as it is local to doSomething method

            String strLocal = "Dev In Test"; // This variale is local to doSomethingElse method
        }

}
