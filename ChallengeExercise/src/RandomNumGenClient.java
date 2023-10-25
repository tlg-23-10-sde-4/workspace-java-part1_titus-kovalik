class RandomNumGenClient {
    public static void main(String[] args) {
        int min = 1;
        int max =20;
        int result = 0;
        //Calculator.randomInt(min, max);

        //iterate 1_000_000 times and check the result against the min and max
        for (int i = 0; i < 1_000; i++)
            result = RandomNumGen.randomInt(min, max);
        System.out.println(result);
    }
}