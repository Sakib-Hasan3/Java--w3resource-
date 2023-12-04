
/*
Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195


*/

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        a=input.nextInt();
         b=input.nextInt();
          c=input.nextInt();

          if(a>b && a>c){
            System.out.println("The greatest : "+a);

          }

          if(b>c && b>a)
          {
             System.out.println("The greatest : "+b);
          }
          else 
          System.out.println("The greatest : "+c);

    }
}