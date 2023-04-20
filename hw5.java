import java.util.Scanner;

public class hw5 {
    public static void greeting() {
        System.out.println("Hey there, welcome to my program!");
    }
    public static double reqGallons(double sqft) {
        return (sqft / 10)*1/2;
    }
    public static double labor (double sqft) {
        return sqft / 10;
    }
    public static double paintCost(double reqGallons, double ppg) {
        return reqGallons * ppg;
    }
    public static double laborCost(double labor) {
        return labor * 40.00;
    }
    public static double totalCost(double paintCost, double laborCost) {
        return paintCost + laborCost;
    }
    public static void main (String [] args) {
        greeting();
        Scanner getData = new Scanner(System.in);
        System.out.println("Enter the price per gallon of paint:");
        double ppg = getData.nextDouble();
        System.out.println("Enter the number of square feet of wall space to be painted:");
        double sqft = getData.nextDouble();
        getData.close();
        System.out.printf(
        "Required Gallons\t Total Labor(hours)\t Paint Cost\t Labor Cost\t Total Cost\n" +
        "%.2f\t     %.2f\t      $%.2f\t     $%.2f\t     $%.2f", 
        reqGallons(sqft), labor(sqft), paintCost(reqGallons(sqft), ppg), laborCost(labor(sqft)), totalCost(paintCost(reqGallons(sqft), ppg),laborCost(labor(sqft))));
    }
}
