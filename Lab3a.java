/*
Modify the Hello World program. Your program should ask the user for a name and 2 other pieces of info of your choice, one should be double and one int.
Print Hello Person's name and other info 
*/

import java.util.Scanner;

public class Lab3a {
    public static void main(String [] args) {
        Scanner userNameScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = userNameScanner.next();
        System.out.println("What is your integer?");
        int userInt = userNameScanner.nextInt();
        System.out.println("What is your double?");
        double userDouble = userNameScanner.nextDouble();
        userNameScanner.close();
        System.out.printf("Hello %s, your integer is %d, and your double is %.2f", 
        userName, userInt, userDouble);
    }
}


