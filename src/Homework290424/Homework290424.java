package Homework290424;
import java.util.*;

public class Homework290424 {
    public static void main(String[] args) {

        double num1, num2;
        double result;
        String text;
        Scanner scanner = new Scanner(System.in);

    //Task 1
    System.out.println("Please insert 2 integer numbers:");
    num1 = scanner.nextDouble();
    num2 = scanner.nextDouble();
    if(num1 > num2){
        System.out.println("The number " + (int)num2 + " can be subtracted from " + (int)num1 + " " + (int)(num1/num2) + " time(s)");
    } else if(num2 > num1){
        System.out.println("The number " + (int)num1 + " can be subtracted from " + (int)num2 + " " + (int)(num2/num1) + " time(s)");
    }else System.out.println("The numbers are equal so just 1 time can be subtracted from each other");

    //Task2
    System.out.println("Please insert any temperature in Celsius to be converted in Fahrenheit:");
    num1 = scanner.nextDouble();
    result = (((num1*2)/100)*100) + 32.0;
    System.out.println("The Fahrenheit temperature is " + result);

    //Task3
    System.out.println("Please insert any integer number:");
    num2 = scanner.nextDouble();
    text =(num2 % 2 == 0) ? "Your number is even" : "Your number is odd";
    System.out.println(text);
    }
}
