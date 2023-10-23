package edu.math;
 /*
 *An "all-static" class, i.e. a class with nothing but methods
 */
import static java.lang.Math.*;

class Calculator {

    //prevent instantiation from outside, this is an all static class.
    private Calculator() {
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(double value) {
        return value % 2 == 0;
    }

    public static int randomInt() {
        // delegate to the min-max version, passing 1 for min and 19 for max
        return randomInt(1, 19);
       // double scaled = (Math.random() * 19) + 1;    // 1.00000 to 19.9999
       //return (int) scaled;
    }

    /*
     * Returns a random int between 'min' and 'max' (inclusive)
     *
     */

    static int randomInt(int min, int max) {
        // TODO: ACE THE LINE BELOW AND DO IT FOR REAL
        double rand = Math.random();
        double scaled = (Math.random() * (max - min + 1)) + min;
        return (int) scaled;
    }
    public static double average(int first, int... rest) {
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum = sum + value;
        }
        return sum / (rest.length + 1);
        //iterate over the rest using for-each,
        //add them up,
        //divide by length
        
//        return result;
    }
}