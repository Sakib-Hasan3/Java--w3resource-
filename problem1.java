
/*Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
*/

import java.util.Scanner;

public class problem1
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();

        if(n>0)
        {
            System.out.println("Number is positive");
        }
        else if (n<0)
        {
            System.out.println("Number is negative");

        }

        else 
        System.out.println("Number is zero");

    }
}