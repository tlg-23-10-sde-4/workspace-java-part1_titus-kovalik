package com.jeep.client;

import com.jeep.Jeep;
import com.jeep.Model;
import com.jeep.Trim;

import java.util.Arrays;

class JeepClientArgs {
    public static void main(String[] args) {
        if (args.length < 6) {
            String usage = "Error: Usage: java JeepClientsArgs <model> <trim> <Snorkel?> <Diesel?> <ClearanceInches> ";
            String example = "Example: java JeepClientsArgs GLADIATOR Willy's true true 15";
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