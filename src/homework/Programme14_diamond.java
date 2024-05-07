package homework;

import java.util.Scanner;

/**
 * . Write a program in Java to display the pattern like a diamond.
 *  While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */
public class Programme14_diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your character");
        Character a= scan.nextLine().charAt(0);

        System.out.println("Enter the leangh for triangle");
        int b= scan.nextInt();
        // called method to display triangle
        display(a,b);
        scan.close();
    }
    // Declare method for triangle
    public static void display(char a, int number){
        int m, n;

        // Outer loop 1
        // prints the first half diamond
        for (m = 1; m <= number; m++) {

            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print(a);
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // Prints the second half diamond
        for (m = number - 1; m > 0; m--) {

            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 print star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print(a);
            }

            // Ending line after each row
            System.out.println();
        }
    }
}
