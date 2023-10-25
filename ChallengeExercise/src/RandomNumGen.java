class RandomNumGen {
    public static int randomInt() {
        // delegate to the min-max version, passing 1 for min and 19 for max
        return randomInt(1, 19);
    }
    public RandomNumGen[] randomNumGen = new RandomNumGen[1000];

    public static int randomInt(int min, int max) {
        double rand = Math.random();
        double scaled = (Math.random() * (max - min + 1)) + min;
        return (int) scaled;
    }

}