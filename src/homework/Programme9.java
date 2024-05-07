package homework;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();
       int ans= sumFirstAndLastDigit(number);
        System.out.println("The sum of first and last digits are: "+ ans);
    }
    public static int sumFirstAndLastDigit(int number){
        int input=number;
        int sum=0;
        int last = number%10;
        int first = number;

           while (first >= 10) {
               //int  last= number%10;
               first = first / 10;


           }
           //System.out.println(first);
           //System.out.println(last);
           sum = first + last;
           System.out.println(sum);

           if (number>=0){
               return sum;

           }
           else{
               return -1;
           }



    }
}
