/*
 Read in an integer from the user. Print whether the number is greater than or less than 100. Use the if else statement.
 */

import java.util.Scanner;

public class Lab3b {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number:");
        int userNum = userInput.nextInt();
        userInput.close();
        if (userNum > 100) {
            System.out.printf("%d is greater than 100", userNum);
        }
        else if (userNum < 100) {
            System.out.printf("%d is less than 100", userNum);
        }
        else {
            System.out.printf("%d is equal to 100", userNum);
        }
    }   
}
