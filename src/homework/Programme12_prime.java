package homework;

import java.util.Scanner;

public class Programme12_prime {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= scan.nextInt();

        //boolean ans = isPrime(number);
        if(isPrime(number)){
            System.out.println(number+" is a prime number");
        }
        else {
            System.out.println(number +" Is not a prime number");
        }
        scan.close();
    }
   public static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }

}
