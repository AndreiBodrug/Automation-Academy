import java.util.Scanner;

public class Homework180424 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String gender, calc_symbol;
        int user_input1, user_input2, result, i;

    //Write a program to read gender(M/F) and print the corresponding gender using a switch statement.
        System.out.println("Problem 1:\n" + "*************************************************");
        System.out.println("Please select on of the genders F or M");
        gender = scanner.nextLine();
        switch (gender){
            case "F":
                System.out.println("You have selected feminine gender");
                break;
            case "M":
                System.out.println("You have selected masculine gender");
                break;
            default:
                System.out.println("Wrong selection");
        }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Write a program to create simple calculator using switch Statement.
        System.out.println("Problem 2:\n" + "*************************************************");
        System.out.println("Please insert 2 numbers to be calculated:");
        user_input1 = scanner.nextInt();
        user_input2 = scanner.nextInt();
        System.out.println("Please select which operation you want to perform - \"+\", \"-\", \"*\" or \"/\"");
        scanner.nextLine();
        calc_symbol = scanner.nextLine();
        switch (calc_symbol){
            case "+":
                System.out.println(user_input1 + " + " + user_input2 + " = " + (user_input1 + user_input2));
                break;
            case "-":
                System.out.println(user_input1 + " - " + user_input2 + " = " + (user_input1 - user_input2));
                break;
            case "*":
                System.out.println(user_input1 + " * " + user_input2 + " = " + (user_input1 * user_input2));
                break;
            case "/":
                System.out.println(user_input1 + "\"/\"" + user_input2 + " = " + (user_input1 * user_input2));
                break;
            default:
                System.out.println("Wrong selection");
        }
    //////////////////////////////////////////////////////////////////////////////////////////
    //Write a program to find the Maximum of Two Numbers using switch statement.
        System.out.println("Problem 3:\n" + "*************************************************");
        System.out.println("Please insert 2 numbers to be compared:");
        user_input1 = scanner.nextInt();
        user_input2 = scanner.nextInt();
        result = user_input1 > user_input2?1:0;
        switch (result){
            case 1:
                System.out.println("The max number is" + user_input1);
                break;
            case 0:
                System.out.println("The max number is " + user_input2);
                break;
            default:
                System.out.println("The numbers are equal!");
        }
    //////////////////////////////////////////////////////////////////////////////////////////////////
    //Write a Java program that calculates the factorial of a given non-negative integer using a while loop.The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
        System.out.println("Please insert 1 number to be used in factorial operation:");
        System.out.println("Problem 4:\n" + "*************************************************");
        i = 1;
        result = 1;
        user_input1 = scanner.nextInt();
        while(i <= user_input1){
            result *= i;
            i++;
        }
        System.out.println("Factorial of " + user_input1 + " is " + result);
    //////////////////////////////////////////////////////////////////////////////////////////
    //Display on the screen the multiplication table for 3.
        System.out.println("Problem 5:\n" + "*************************************************");
        i = 1;
        while (i <= 9) {
            System.out.println(i + " * 3 = " + i * 3);
            i++;
        }
    ///////////////////////////////////////////////////////////////////////////////////////////
    //Write a program where the user enters any positive integer. The program then calculates the sum of all numbers from 1 to the number entered by the user.
        System.out.println("Problem 6:\n" + "*************************************************");
        System.out.println("Please insert any positive number:");
        user_input1 = scanner.nextInt();
        result = 0;
        for(i = 1; i <= user_input1; i++){
            result +=i;
        }
        System.out.println("The sum of all numbers from 1 to the number entered by you is " + result);
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //The program should display the following sequence on the screen:7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        System.out.println("Problem 7:\n" + "*************************************************");
        System.out.println("The logical sequence is:");
        for(i = 7; i <= 98; i = i+7){
        System.out.println(i);
        }
    }
}