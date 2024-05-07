package homework;

import java.util.Scanner;

public class Programme3 {
    public void vowelOrConsonent(String input){

        boolean upper= input.charAt(0)>=65 && input.charAt(0)<=90;
        boolean lower=input.charAt(0)>=97 && input.charAt(0)<=122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");
        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(upper || lower))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }

    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the alphabet character:");
        String input= scan.nextLine().toLowerCase();
        Programme3 obj = new Programme3();
        obj.vowelOrConsonent(input);
        scan.close();
    }
}
