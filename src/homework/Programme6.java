package homework;

import java.util.Scanner;

/**
 * Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the input number");
        int number = scan.nextInt();
        display(number);
    }
    public static void display(int number){
        for (int i=1; i<=number;i++){
            for (int j=1; j<i+1;j++) {

                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
