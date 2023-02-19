/*
Write a program that reads in an integer from the keyboard, and then checks whether the integer:
is NOT divisible by 3  OR  it is less than 100
print a message to that effect. 
*/


import java.util.Scanner;

public class Lab4a {
    public static void main(String [] args) {
        System.out.println("Enter a number: ");
        Scanner getInt = new Scanner(System.in);
        int userInt = getInt.nextInt();
        getInt.close();
        if (userInt%3 != 0 || userInt < 100 ) {
            System.out.printf("%d does satisfy the condition", userInt);
        }
        else {
            System.out.printf("%d does not satisfy the condition", userInt);
        }
    }
}
