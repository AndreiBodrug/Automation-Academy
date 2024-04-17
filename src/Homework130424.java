import java.util.Scanner;

public class Homework130424 {
    public static void main(String[] args) {
    //Problem nr. 1
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter any integer number!");
        int num1 = myInput.nextInt();
        System.out.println("The square of this number is " + (num1 * num1));

    //Problema nr. 2
        System.out.println("Please enter any integer first number!");
        int num2 = myInput.nextInt();
        System.out.println("Please enter any integer second number!");
        int num3 = myInput.nextInt();
        System.out.println("The sum of these 2 numbers is " + (num2 + num3));
        System.out.println("The multiplication of these 2 numbers is " + (num2 * num3));

    //Problema nr.3
        System.out.println("Please enter a side of square!");
        int num4 = myInput.nextInt();
        System.out.println("The area of the square is " + (num4 * num4));
        System.out.println("The perimeter of the square is " + (num4 * 4));

    }
}