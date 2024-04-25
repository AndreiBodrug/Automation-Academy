package Homework230424;
import java.util.*;

//Write a method that takes an integer as an argument and returns its factorial.
public class Homework230424 {

    static void factorial(int a){
        int i = 1;
        int result = 1;
        while(i <= a) {
            result *= i;
            i++;
        }
        System.out.println("Factorial of " + a + " is " + result);
    }
//Write a method that takes an integer and returns the sum of its digits.
    static void sumDigits(String inputNumber){
        char[] splitCharDigits = inputNumber.toCharArray();
        int[] splitIntDigits;
        splitIntDigits = new int [splitCharDigits.length];

        for(int i = 0; i < splitCharDigits.length; i++){
            splitIntDigits[i] = Character.getNumericValue(splitCharDigits[i]);
        }
        System.out.println("The sum of digits from the number you provided is " + Arrays.stream(splitIntDigits).sum());
    }
//Write a method that takes a string and determines whether it is a palindrome
    static void palindromeCheck(String text){
        StringBuffer textReverse = new StringBuffer(text);

        if(textReverse.reverse().toString().toLowerCase().equals(text.toLowerCase())){
            System.out.println("You got it! Your text is palindrome.");
        }else System.out.println("Your text is not palindrome");
    }
//Main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String numberToBeSplit, text;
        int numberFactorial;

        System.out.println("Please insert one number formated at least from 2 digits:" );
        numberToBeSplit = scanner.nextLine();
        sumDigits(numberToBeSplit);

        System.out.println("Please insert one integer number which factorial should be calculated");
        numberFactorial = scanner.nextInt();
        factorial(numberFactorial);

        System.out.println("Please write one word:");
        scanner.nextLine();
        text = scanner.nextLine();
        palindromeCheck(text);
    }
}

