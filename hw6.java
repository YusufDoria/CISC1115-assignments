import java.util.Scanner;
import java.io.*;

public class hw6 {

    public static int sumLoans(double [] arr) {
        int sum = 0;
        for (int i =0; i < arr.length; i++) {
            sum+=arr[i];
        }

        return sum;
    }

    public static int findWorst(double [] amounts, double [] returns, int totalLoans) {
        int index = 0;
        double worst = 1.0;

        double [] percents = new double [totalLoans];

        for (int i=0; i<totalLoans; i++) {
            percents[i] = returns[i] / amounts[i];
        }

        for (int i=0; i<totalLoans; i++) {
            if (percents[i] < worst) {
                worst = percents[i];
                index = i;
            }
        }

        return index;
    }
    public static int findBest(double [] amounts, double [] returns, int totalLoans) {
        int index = 0;
        double best = 0.0;

        double [] percents = new double [totalLoans];

        for (int i=0; i<totalLoans; i++) {
            percents[i] = returns[i] / amounts[i];
        }

        for (int i=0; i<totalLoans; i++) {
            if (percents[i] > best) {
                best = percents[i];
                index = i;
            }
        }

        return index;
    }
    public static void printArrays(double [] arr1, double [] arr2) throws Exception{
        PrintWriter pw = new PrintWriter("output.txt");
        pw.println("Amount\t Returned");
        for (int i=0; i<arr1.length; i++) {
            pw.printf("%.2f\t %.2f\n", arr1[i], arr2[i]);
        }
        pw.close();
    }
    public static void main (String [] args) throws Exception {
        System.out.println("Enter the number of loans:");

        Scanner getTotalLoans = new Scanner(System.in);

        int totalLoans = getTotalLoans.nextInt();
        getTotalLoans.close();

        Scanner fileReader = new Scanner(new File("input.txt"));

        double [] loanAmounts = new double [totalLoans];
        double [] loanReturns = new double [totalLoans];

        for (int i = 0; i<5; i++) {
            loanAmounts[i] = fileReader.nextInt();
            loanReturns[i] = fileReader.nextInt();
        }
        fileReader.close();

        int sumOfLoans = sumLoans(loanAmounts);
        int sumOfReturns = sumLoans(loanReturns);

        System.out.printf("$%d have not been returned.\n", sumOfLoans-sumOfReturns);

        printArrays(loanAmounts, loanReturns);


    }
}
