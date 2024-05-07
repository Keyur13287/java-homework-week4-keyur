package homework;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers you want ?");
        int number=scan.nextInt();
        MinAndMaxInputChallenge obj= new MinAndMaxInputChallenge();
        obj.getUserData(number);
        scan.close();
    }
    public void getUserData(int length){
            int i=0;
            Scanner scanner= new Scanner(System.in);
        int input[] = new int[length];
        while (i < length){
            System.out.println("Enter the number #" + (i+1));
            if(!scanner.hasNextInt()){
                System.out.println("Entered " + (i+1) + " number is not valid");
                int newArr[] = Arrays.copyOf(input, i);
                findMaxMin(newArr);
                return;
            } else {
                input[i] = scanner.nextInt();
                i++;
            }
        }
        // Called static method directly
        findMaxMin(input);
    }
    // Find mix and min values from array
    public static void findMaxMin(int[] numArray){
        System.out.println("Entered values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Maximum number from your given numbers : " + Arrays.stream(numArray).max());
        System.out.println("Minimum number from your given numbers : " + Arrays.stream(numArray).min());
    }
    }

