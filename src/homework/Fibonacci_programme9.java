package homework;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Fibonacci_programme9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the end value to get the fibonacci series");
        int number= scan.nextInt();
        fibonacci(number);
    }
    public static void fibonacci(int num){
        int num1=1;
        int num2=1;
        for (int i=1;i<=num;i++){
            System.out.print(num1+ " ");
            // swap the number
        int num3=num1+num2;
        num1=num2;
        num2=num3;
        }



    }
}
