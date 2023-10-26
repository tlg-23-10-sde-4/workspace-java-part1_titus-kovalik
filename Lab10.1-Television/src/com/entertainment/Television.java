package com.entertainment;

import java.util.Arrays;

/*
 * business class to model the workings of a television
 */
public class Television {
    //statics
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;
    public static int getInstanceCount() {
        return instanceCount;
    }
    public static final String[] VALID_BRANDS = {"Samsung", "Sony", "LG", "Toshiba"};

    // attributes or properties - aka "fields" or "instances" in Java
    private String brand = "Unknown ";
    private int volume = MIN_VOLUME;
    private DisplayType display = DisplayType.LED;
    //for muting behavior
    private boolean isMuted;
    private int oldVolume;

    //CTORs:
    public Television() {
        Television.instanceCount++;
    }
    public Television(String brand) throws InvalidBrandException {
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume)
     throws IllegalArgumentException, InvalidBrandException {
        this(brand);
        setVolume(volume);
    }
    public Television(String brand, int volume, DisplayType display)
     throws IllegalArgumentException, InvalidBrandException {
        this(brand, volume);
        setDisplay(display);
    }

    // functions or operations  - aka "methods" in Java - what do Television objects do?
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down... Goodbye");
    }
    //accessor methods
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) throws InvalidBrandException  {
        boolean valid = false;

        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            throw new InvalidBrandException(String.format(
                    "Invalid brand: %s. Must be one of the %s.\n",
                    brand, Arrays.toString(VALID_BRANDS)));
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }
    //
    private boolean verifyInternetConnection() {
        return true;
    }
    //
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws IllegalArgumentException {
       if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
           this.volume = volume;
           isMuted = false;
       }
       else {
           throw new IllegalArgumentException(String.format(
                   "Invalid volume: %s, volume must be between %s and %s \n",
                   volume, MIN_VOLUME, MAX_VOLUME));
        }
    }

    //
    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }
    //

    public void muted() {
        if (!isMuted()) {
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    private boolean isMuted() {
        return true;
    }

    public String toString() {
        return String.format("Television: brand:%s, volume:%s, display:%s",
                getBrand(), getVolume(), getDisplay());
    }
}