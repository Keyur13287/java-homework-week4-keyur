package homework;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        //create object of class to access instance method into main method
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.sumNum();
    }
    //create instance method
    public void sumNum() {
        //create scanner to get data from user
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;


        while (count < 10) {
            int num = count + 1;
            System.out.println("Enter number #" + num + " :");

            if (scanner.hasNextInt()) {
                int numb = scanner.nextInt();
                sum += numb;
                count++;
            } else {

                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of 10 number is :" + sum);
        //close scanner
        scanner.close();
    }
}
