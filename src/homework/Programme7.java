package homework;

import java.util.Scanner;

public class Programme7 {
    //Declare main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to calculate");
        int number = scanner.nextInt();
        sumFirstAndLastDigit(number);
        System.out.println("Sum of the first and last digits: " + sumFirstAndLastDigit(number));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }
        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        return lastDigit + number;
    }
}
