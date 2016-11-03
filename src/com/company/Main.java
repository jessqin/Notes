package com.company;

public class Main {

    public static void main(String[] args)
    {
	    //Lesson 21 and 22

        //classes that convert data types into objects
        /* They essentially wrap the number, boolean, or char inside an object
        The four big ones are Int, double, boolean, char
        */
        Integer ic = 7;
        int i = 10;
        Integer ii = i; // This is now an object

        /* Autoboxing is an automatic conversion between primitive datat types (int, double) and the corresponding wrapper classes (Integer, Double) is not in the AP Java subset.
        Additional methods:
        Converting an int to a String
        public String toString(int i);

        Easier way:
        append an int type to an empty String and the compiler will think that you want to make a string

        */
        int j = 3;
        String s = "" + j; //s will be equal to "3"

    }
}
