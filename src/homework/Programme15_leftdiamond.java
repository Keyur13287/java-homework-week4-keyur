package homework;

import java.util.Scanner;

public class Programme15_leftdiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your character");
        Character a = scan.nextLine().charAt(0);

        System.out.println("Enter the leangh for triangle");
        int b = scan.nextInt();
        // called method to display triangle
        display(a, b);
        scan.close();
    }

    // Declare method for triangle
    public static void display(char a, int len) {
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(a);
            }
            System.out.println("");
        }


    }
}
