package homework;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10_armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        armstrong(number);
    }


    public static void armstrong(int num) {
        int result=0,remainder;

        int original=num;

        while (original!=0){
            remainder=original%10;
            result= result+ remainder*remainder*remainder;
            original=original/10;
        }
        if (result==num){
            System.out.println("The number is armstrong");
        }
        else {
            System.out.println("The number is not armstrong");
        }
    }
}