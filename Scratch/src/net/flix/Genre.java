package net.flix;

public enum Genre {
    HORROR("HORROR"),
    HISTORICAL("Historical"),
    ACTION("ACTION!!!"),
    COMEDY("Comedy :)"),
    SPORTS_ROMANCE("SpOrT's RoMaNcE :0"),
    WESTERN("Western");

    //everything below is regular class stuff
    private final String display;

    //CTORs
    Genre(String display) {         // Automatically private by definition
        this.display = display;

    }

    public String display() { //standard getter renamed to just "Display" instead of "getSomething"
        return display;
    }

    @Override
    public String toString() {
        return display();       //generally better to call own getter
    }
}