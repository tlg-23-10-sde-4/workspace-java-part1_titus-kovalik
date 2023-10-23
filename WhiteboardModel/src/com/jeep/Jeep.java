package com.jeep;

public class Jeep {
    //STATICS:
    public static final double MAX_CLEARANCE = 20.0;
    public static final double MIN_CLEARANCE = 12.0;

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // FIELDS:
    private Model model = Model.WRANGLER;
    private Trim trim = Trim.SPORT;
    private boolean isDiesel = false;
    public double clearanceInches = MIN_CLEARANCE;
    public boolean hasSnorkel = false;

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
        setHasSnorkel(hasSnorkel);
    }

    public Jeep(Model model, Trim trim, boolean hasSnorkel, boolean isDiesel) {
        this(model, trim, hasSnorkel);
        setDiesel(isDiesel);
    }

    public Jeep(Model model, Trim trim, boolean hasSnorkel, boolean isDiesel, double clearanceInches) {
        this(model, trim, hasSnorkel, isDiesel);
        setClearanceInches(clearanceInches);
    }

    //METHODS:
    public void turnOn() {
        System.out.println("The " + model + " starts right up!");
    }

    //
    public void turnOff() {
        System.out.println("Turning off the Jeep ");
        System.out.println("The " + model + " goes quiet.");
        System.out.println();//for space
    }

    //
    public void goForwards() {
        System.out.println(model + " drives forward");
    }

    //
    public void goesLeft() {
        System.out.println("turning left");
    }

    //
    public void goesRight() {
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
            System.out.println(toString());
        } else {
            System.out.println("current clearance is " + clearanceInches);
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
    public boolean HasSnorkel() {
        return hasSnorkel;
    }

    public void setHasSnorkel(boolean hasSnorkel) {
        this.hasSnorkel = hasSnorkel;
    }

    //TO_STRING:
    public String toString() {
        return "Jeep: Model:" + model + ", Trim:" + trim + ", Diesel:" + isDiesel
                + ", Snorkel:" + hasSnorkel + ", clearance inches:" + clearanceInches;
    }
}