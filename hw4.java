/*Your program is processing a file that contains the results of this survey. The first column
contains a 2 character code for a state. The second column contains the total number of
participants in the survey. The third column contains the number of participants that
answered that they are covered by health insurance, and the fourth column contains the
number of those that are not covered by health insurance. */

import java.util.Scanner; //import scanner
import java.io.*; //import functions for input and output

public class hw4 {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("output.txt"); // init print writer
        Scanner fileReader = new Scanner(new File("input.txt")); // inint file reader
        System.out.println("State\tCovered\tNot Covered");
        pw.println("State\tCovered\tNot Covered");
        while (fileReader.hasNext()) { // while there is more data in file
            String state = fileReader.next(); // store state
            double total = fileReader.nextDouble(); // store total
            double covered = fileReader.nextDouble(); // store total covered
            double notCovered = fileReader.nextDouble(); // store total not covered

            double coveredPercentage = covered / total; // calculate percentages
            double notCoveredPercentage = notCovered / total; // calculate percentages

            System.out.printf("%s\t%.2f\t%.2f\n", state, coveredPercentage, notCoveredPercentage);
            pw.printf("%s\t%.2f\t%.2f\n", state, coveredPercentage, notCoveredPercentage); // write line to output
        }
        pw.close(); // close print writer
    }
}
