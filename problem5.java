/*
 * Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

Test Data
Input number: 3
Expected Output :
Wednesday
 */

import java.util.Scanner;

public class problem5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                System.out.println(dayName);
                break;
            case 2:
                dayName = "Tuesday";
                  System.out.println(dayName);
                break;
            case 3:
                dayName = "Wednesday";
                  System.out.println(dayName);
                break;
            case 4:
                dayName = "Thursday";
                  System.out.println(dayName);
                break;
            case 5:
                dayName = "Friday";
                  System.out.println(dayName);
                break;
            case 6:
                dayName = "Saturday";
                  System.out.println(dayName);
                break;
            case 7:
                dayName = "Sunday";
                  System.out.println(dayName);
                break;
            default:
                dayName = "Invalid day range";
                  System.out.println(dayName);
        }

        
    }
}
