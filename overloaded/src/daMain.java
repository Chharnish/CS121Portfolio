public class daMain {
    public static void main(String[] args) {
        bikes bichael = new bikes();
        bikes beter = new bikes("Beter");
        bikes bichael2 = new bikes("Bichael 2.0", "Gray", 21, 27.5);

        bichael2.bikeData();
        bichael2.bikeData("Bichael 2");

    }
}
