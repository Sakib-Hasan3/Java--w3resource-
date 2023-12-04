/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.


Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
*/

import java.util.Scanner;

public class problem4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        a = (int) input.nextDouble();

        if (a > 0) {
            if (a < 1) {
                System.out.println("Positive small number");
            } else if (a > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        } else if (a < 0) {
            if (Math.abs(a) < 1) {
                System.out.println("Negative small number");
            } else if (Math.abs(a) > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
