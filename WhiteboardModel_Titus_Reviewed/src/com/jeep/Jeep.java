package com.jeep;

/**
 * JR: Demonstrates understanding of program concepts, with improvements needed.
 * ValidationTest not thorough enough, and bug in ClientArgs, but otherwise sound.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been excellent, keep it up!
 *
 * Class names, package names, and overall structure are correct.
 */
public class Jeep {
    //STATICS:
    public static final double MAX_CLEARANCE = 20.0;
    public static final double MIN_CLEARANCE = 12.0;

    private static int instanceCount = 0;

    // JR: you only had to implement this if you found it interesting to do so. --- I did
    public static int getInstanceCount() {
        return instanceCount;
    }

    // FIELDS:
    private Model model = Model.WRANGLER;
    private Trim trim = Trim.SPORT;
    private boolean isDiesel = false;

    // JR: fields should be private --- DONE
    private double clearanceInches = MIN_CLEARANCE;
    private boolean hasSnorkel = false;

    //CTORS:
    public Jeep() {
        Jeep.instanceCount++;
    }

    public Jeep(Model model) {
        this();
        setModel(model);
    }

    public Jeep(Model model, Trim trim) {
        this(model);
        setTrim(trim);
    }

    public Jeep(Model model, Trim trim, boolean hasSnorkel) {
        this(model, trim);
        setSnorkel(hasSnorkel);
    }

    public Jeep(Model model, Trim trim, boolean hasSnorkel, boolean isDiesel) {
        this(model, trim, hasSnorkel);
        setDiesel(isDiesel);
    }

    public Jeep(Model model, Trim trim, boolean hasSnorkel, boolean isDiesel, double clearanceInches) {
        this(model, trim, hasSnorkel, isDiesel);
        setClearanceInches(clearanceInches);
    }

    // JR: generally better to call your own getters vs. direct field access ---- ASK ABOUT THIS

    //METHODS:
    public void turnOn() {
        System.out.println("The " + model + " starts right up!");
    }

    //
    public void turnOff() {
        System.out.println("Turning off the Jeep ");
        System.out.println("The " + model + " goes quiet.");
    }

    // JR: be consistent in method naming:
    //  goForwards() in one case, goesLeft() ['go' vs. 'goes']---DONE

    //
    public void goForwards() {
        System.out.println(model + " drives forward");
    }

    //
    public void goLeft() {
        System.out.println("turning left");
    }

    //
    public void goRight() {
        System.out.println("turning right");
    }

    //
    public void fordsRiver() {
        if (clearanceInches >= 15) {
            System.out.println("fords river");

        } else {
            System.out.println(" fails to cross river.");
            obstacleFail();
        }
        System.out.println();
    }

    //
    public void rockCrawl() {
        if (clearanceInches >= 18) {
            System.out.println("drives over rocks");
        } else {
            System.out.println(" fails to get over rocks.");
            obstacleFail();
            turnOff();
        }
        System.out.println();
    }

    //
    private void obstacleFail() {
        System.out.println("This Jeep can't go there!");
    }
    //

    //ACCESSORS: note "//____" is used to separate accessors visually
    public double getClearanceInches() {
        return clearanceInches;

    }

    public void setClearanceInches(double clearanceInches) {
        if (clearanceInches >= MIN_CLEARANCE && clearanceInches <= MAX_CLEARANCE) {
            this.clearanceInches = clearanceInches;
            System.out.println("This Jeep looks sick!");

            // JR: this output just adds clutter to the application
            System.out.println(this);  // JR: or just sout(this) --- DONE
        } else {
            // JR: inappropriate message, because the current clearance is not set to this, nor will be
            // Instead, include the parameter value in the error message. --- DONE

            System.out.println("This Jeep " + model +
                    " isn't trail worthy. Must be between " + MIN_CLEARANCE +
                    " and " + MAX_CLEARANCE +
                    " inches of clearance");
        }
    }

    //____
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    //____
    public Trim getTrim() {
        return trim;
    }

    public void setTrim(Trim trim) {
        this.trim = trim;
    }

    //____
    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    //____
    // JR: methods in Java never begin with a capital letter --- DONE
    public boolean hasSnorkel() {
        return hasSnorkel;
    }

    // JR: better name = setSnorkel()--- DONE
    public void setSnorkel(boolean hasSnorkel) {
        this.hasSnorkel = hasSnorkel;
    }

    //TO_STRING:
    // JR: generally better to call your own getters vs. direct field access --- DONE
    public String toString() {
        return "Jeep: Model:" + getModel() + ", Trim:" + getTrim() + ", Diesel:" + isDiesel()
                + ", Snorkel:" + hasSnorkel() + ", clearance inches:" + getClearanceInches();
    }
}