import java.util.Scanner;

public class Homework160424 {
    public static void main(String[] args){

        double a, b, c, greaterNumber;
        int year;
        double[] arr;
        arr = new double[5];
        double sum = 0;
        String text = "I love Java";

    //Write a Java program to get a number from the user and print whether it is positive or negative
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert any double number:");
        a = scanner.nextDouble();
        if (a >= 0){
            System.out.println("Your number is positive");
        }
        else {
            System.out.println("Your number is negative");
        }

    //Write a Java program that takes three numbers from the user and prints the greatest number
        System.out.println("Please insert 3 any double numbers:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        greaterNumber = Math.max(a,b);
        System.out.println("The greatest number from those ones provided above is " + Math.max(greaterNumber,c));

    //Write a Java program that takes a year from the user and prints whether it is a leap year or not
        System.out.println("Please insert any year:");
        year = scanner.nextInt();
        if (year % 4 == 0){
            System.out.println("Your year is leap");
        }
        else {
            System.out.println("Your year is not leap");
        }

    //Write a program in Java to input 5 numbers from the keyboard and find their sum and average
        System.out.println("Please insert 5 any double numbers:");
        for (int i=0; i < arr.length; i++){
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }
        System.out.println("The sum of these 5 double numbers is " + sum);
        System.out.println("The average of these 5 double numbers is " + (sum/5));

    //There is a string "I love Java". Print the letter at index 4.
        System.out.println("Index position 4 contains a letter \'" + text.charAt(4) + "\'");
    //There is a string "I love Java". Print the index of the letter 'J'.
        System.out.println("The index of a letter \'J\' is " + text.indexOf("J"));
    //There is a string "I love Java". Add "and QA Automation" to this phrase.
        System.out.println("The new phrase is \"" + text.concat(" and QA Automation") + "\"");
    //There is a string "I love Java". Check via boolean if the phrase "I love Java" is of type String.
        System.out.println("Is provided variable of type String? The answer is:\n " + (text instanceof String));
    }
}
