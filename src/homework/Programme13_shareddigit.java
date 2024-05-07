package homework;

import java.util.Scanner;

public class Programme13_shareddigit {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number 1");
        int input1= in.nextInt();
        System.out.println("Enter number 2:");
        int input2= in.nextInt();
        System.out.println("Result: " + comon(input1, input2));
//        boolean ans =comon(input1,input2);
//        if (ans){
//            System.out.println("This two number has a sharesd digit");
//        }
    }
    public static boolean comon(int num1,int num2){
        if (num1 <=10 || num2 >=99) {
            return false;
        }

        // Extract the last digit of each number
        int x = num1 % 10;
        int y = num2 % 10;

        // Remove the last digit from both numbers
        num1 /= 10;
        num2 /= 10;
// Check if there's a common digit by comparing the remaining digits
        return (num1 == num2 || num1 == y || x == num2 || x == y);
    }
}
