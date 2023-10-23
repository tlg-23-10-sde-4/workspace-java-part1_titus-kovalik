package edu.math;



class CalculatorClient {

    public static void main(String[] args) {


        double sum = Calculator.add(3, 5); //doubles are passed where doubles are expected
        System.out.println("The sum is " + sum);
        //below, it's okay to pass ints where doubles are expected in the subtract() method
        //at runtime, an implicit upcast is automatic, converts whole number to (X).0
        System.out.println("The difference is " + Calculator.subtract(3,5));

        System.out.println("10 is even? " + Calculator.isEven(10));

        System.out.println("The average is: " + Calculator.average(3, 4,5,9,15));

        System.out.println();

    // calls the min-max version
        int min = 5;
        int max =20;
        boolean itWorks = true;
        int result = 0;
                //Calculator.randomInt(min, max);

        //iterate 1_000_000 times and check the result against the min and max
        for (int i = 0; i < 10_000_000; i++) {
            result = Calculator.randomInt(min, max);

            if (result < min || result > max) {
                itWorks = false;
                break;
            }
        }
        if (itWorks) {
            System.out.println("Congrats it works");
        }
        else {
            System.out.println("YOU GOT A BUG");
            System.out.println("The value returned is: " + result);
        }
    }
}