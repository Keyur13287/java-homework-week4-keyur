package homework;

import java.util.Scanner;

public class Programme11_geteven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int res=getEvenDigitSum(num);
        System.out.println("The sum of evem numbers are : " + res);
    }
    //
    public static int getEvenDigitSum(int number) {
        int sum_even = 0;
        int sum_odd = 0;
        int originalnumber = number;
        while (originalnumber > 0) {
            int last = originalnumber % 10;
            if (last % 2 == 0) {
                sum_even = sum_even + last;
            }
//            else {
//                sum_odd = +last;
//            }
            originalnumber = originalnumber / 10;
        }
        if (number >= 0) {
            return sum_even;
        }
        else {
            return -1;
        }

    }
}
