package homework;

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check ");
        int number = scanner.nextInt();
        boolean result = isPalindrome(number);
        if(result == true){
            System.out.println("The given number "+ number +" is palindrome number ");
        } else {
            System.out.println("The given number "+ number +" is not palindrome number");
        }
        // scanner class close
        scanner.close();

    }
    // 707 -
    public static boolean isPalindrome(int number){
        int finalNum = number;
        int reverseNumber = 0;
        while (number > 0){
            reverseNumber =  reverseNumber * 10 + number % 10;
            //System.out.println(reverseNumber);
            number = number / 10;
        }
        if (finalNum == reverseNumber){
            return true;
        } else{
            return false;
        }
    }
}
