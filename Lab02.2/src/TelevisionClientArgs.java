/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;
import java.util.Locale;

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
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: supported displays are " + Arrays.toString(DisplayType.values());
            String note2 = "Volume must be between: " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME;
            String note3 = "Brand must be: ";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
//        System.out.println("You provided " + args.length + " arguments");

        //step 1 convert the strings as necessary :
        //brand needs to be a string, and it already is
        //volume needs to be an int, and it's currently a string
        //display needs to be a displayType
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType displayType = DisplayType.valueOf(args[2].toUpperCase());

        //step 2 create a Television object from these 3 ingredients
        Television tv = new Television(brand, volume, displayType);

        //step 3: congratulate them on their order and show the tv
        System.out.println("Congrats on your order:");
        System.out.println(tv);


    }
}