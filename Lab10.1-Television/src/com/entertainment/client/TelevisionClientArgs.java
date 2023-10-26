package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            printUsage();
            return;  // early return from main(), application exits
        }
        //1. convert strings to proper types
        String brand = null;
        int volume = 0;
        DisplayType displayType = null;
        try {
            brand = args[0];
            volume = Integer.parseInt(args[1]);
            displayType = DisplayType.valueOf(args[2].toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("There's been an error with your inputs:");
            System.out.printf("You entered: %s %s %s\n", args[0], args[1], args[2]);
            printUsage();
            return;
        }


        try {
            //step 2 create a Television object from these 3 ingredients
            Television tv = new Television (brand, volume, displayType);

            //step 3: congratulate them on their order and show the tv
            System.out.println("Congrats on your order:");
            System.out.println(tv);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
            printUsage();
        }
    }

    private static void printUsage() {
        String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
        String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
        String note = "Note: supported displays are " + Arrays.toString(DisplayType.values());
        String note2 = "Volume must be between: " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME;
        String note3 = "Brand must be: ";
        System.out.println(usage);
        System.out.println(example);
        System.out.println(note);
    }
}