/*
Write a program that prompts the user for a day of the week as an integer.
1 for Sunday, 2 for Monday, etc.
Then, prompt the user for a number of days in the future. Print the day of the week that it is today, and the day that it will be on the future day.
For example, if the user enters 2 for today, and 14 days in the future, print:
Today is Monday, and in 14 days the day of the week will be Monday.
*/

import java.util.Scanner;

public class hw2 {

    public static String getDay(int futureDayNum, int today) {
        String day = "";
        if ((futureDayNum%7 + today)%7 == 1) {
            day = "Sunday";
        }
        else if ((futureDayNum%7 + today)%7 == 2) {
            day = "Monday";
        }
        else if ((futureDayNum%7 + today)%7 == 3) {
            day = "Tuseday";
        }
        else if ((futureDayNum%7 + today)%7 == 4) {
            day = "Wednesday";
        }
        else if ((futureDayNum%7 + today)%7 == 5) {
            day = "Thursday";
        }
        else if ((futureDayNum%7 + today)%7 == 6) {
            day = "Friday";
        }
        else if ((futureDayNum%7 + today)%7 == 0) {
            day = "Saturday";
        }
        return day;
    }
    public static void main (String [] args) {
        System.out.println("What day is it today?");
        Scanner userDay = new Scanner(System.in);
        int day = userDay.nextInt();
        System.out.println("How many days in the future?");
        int futureDay = (userDay.nextInt());
        userDay.close();
        System.out.printf("Today is %s, and in %d days it will be %s \n", getDay(0,day), futureDay, getDay(futureDay, day));
        
    }
}

