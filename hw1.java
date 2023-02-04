public class hw1 {
    public static void main(String[] args) {
        double d1 = 9.3, t1 = 33, d2 = 10.4, t2 = 40;
        t1 = t1/60;
        t2 = t2/60;
        double average = (d1 + d2) / (t1 + t2);
        System.out.printf(
            "Car 1      Distance        Time\n" +
            "Trip 1     %.2f miles      %.2f hours\n" +
            "Trip 2     %.2f miles      %.2f hours\n" +
            "Average speed: %.0f mph\n", d1, t1, d2, t2, average
        );
        d1 = 36; t1 = 30; d2 = 40; t2 = 23;
        t1 = t1/60;
        t2 = t2/60;
        average = (d1 + d2) / (t1 + t2);
        System.out.printf(
            "\nCar 2    Distance        Time\n" +
            "Trip 1     %.2f miles      %.2f hours\n" +
            "Trip 2     %.2f miles      %.2f hours\n" +
            "Average speed: %.0f mph", d1, t1, d2, t2, average
        ); 
    }
}
