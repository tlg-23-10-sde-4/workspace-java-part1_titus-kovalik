package com.jeep.client;

import com.jeep.Jeep;
import com.jeep.Model;
import com.jeep.Trim;

import java.util.Arrays;

/**
 * JR: generally correct, but flawed in a few areas.
 *  - Bug in if-else logic, should be "if (args.length < 5)", since you require 5 arguments here.
 *
 *  - Example usage does not work, results in usage banner.
 *
 *  - If I provide an extra dummy argument, to get past the if logic for 6 arguments,
 *    example usage still fails, i.e.,
 *     java com.jeep.client.JeepClientArgs GLADIATOR Willy's true true 15 __extra__arg__
 *
 *    results in this output:
 *     Exception in thread "main" java.lang.IllegalArgumentException: No enum constant com.jeep.Trim.WILLY'S -----FIXED
 *
 *    This is a result of the toString() method in Trim enum.  Note the usage info (from console):
 *     Note: Available models are:  [WRANGLER, GLADIATOR, RENEGADE, CHEROKEE]
 *     Note 2: Available trims are: [Rubicon, Mojave, Willy's, Sports, Overland]
 *    More thorough testing might have revealed this bug.
 */
class JeepClientArgs {
    public static void main(String[] args) {
        if (args.length < 5) {  // JR: should be < 5, since you are expecting 5 input arguments --- DONE
            String usage = "Error: Usage: java JeepClientsArgs <model> <trim> <Snorkel?> <Diesel?> <ClearanceInches> ";
            String example = "Example: java JeepClientsArgs GLADIATOR Willys true true 15";
            String note = "Note: Available models are: " + Arrays.toString(Model.values());
            String note1 = "Note 2: Available trims are: " + Arrays.toString(Trim.values());
            String note2 = "Note 3: Snorkel and Diesel must be true or false";
            String note3 = String.format("Note 4: ClearanceInches must be between %s and %s", Jeep.MIN_CLEARANCE, Jeep.MAX_CLEARANCE);

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;
        }

        Model model = Model.valueOf(args[0].toUpperCase());
        Trim trim = Trim.valueOf(args[1].toUpperCase());
        boolean snorkel = Boolean.parseBoolean(args[2]);
        boolean diesel = Boolean.parseBoolean(args[3]);
        double clearanceInches = Double.parseDouble(args[4]);

        Jeep truck = new Jeep(model, trim, snorkel, diesel, clearanceInches);

        System.out.println("This truck meets criteria");
        System.out.println(truck);
    }

}