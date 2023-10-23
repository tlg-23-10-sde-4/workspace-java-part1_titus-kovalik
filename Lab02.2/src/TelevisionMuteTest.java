class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);
        System.out.println(tv);

        tv.muted();
        tv.muted();

        System.out.println(tv);
    }
}