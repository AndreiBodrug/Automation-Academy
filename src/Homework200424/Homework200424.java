package Homework200424;
import java.util.Arrays;
import java.util.Scanner;

public class Homework200424 {
    public static void main(String[] args){

        int [] arr, arrIndex;
        int [] arr1, arr2;
        int [] arr3, arr4, arrUnion;
        int lenArr, maxMin, i, j = 0, elementIndex, index, lenArr3, lenArr4;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the length of your integer array to be used for the next 4 problems");

        lenArr = scanner.nextInt();
        arr = new int[lenArr];
        arrIndex = new int[lenArr];

        System.out.println("Please insert randomly integer numbers of your array to be used for the next 4 problems");
        for(i = 0; i < lenArr; i++){
            arr[i] = scanner.nextInt();
            arrIndex[i] = arr[i];
        }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Write a Java program to reverse an array of integers.
        System.out.println("Problem 1:\n" + "*************************************************");
        System.out.println("Your reverse array is:");
        for(i = 0; i < lenArr; i++){
                System.out.print(arr[lenArr - 1 - i] + " ");
        }

    /////////////////////////////////////////////////////////////////////////////////////////////
    //Write a Java program to sort an array of integers in ascending and descending order.
        System.out.println("\n\nProblem 2:\n" + "*************************************************");
        for(i = 0; i < lenArr; i++){
            maxMin = arr[i];
            for(j = i; j < lenArr; j++) {
                if (maxMin <= arr[j]) {
                    arr[i] = maxMin;
                } else {
                    arr[i] = arr[j];
                    arr[j] = maxMin;
                    maxMin = arr[i];
                }
            }
        }
        System.out.println("Your array sorted ascending is:");
        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println("\nYour array sorted descending is:");
        for(i = lenArr-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //Write a Java program to calculate the average of all elements in an integer array.
        System.out.println("\n\nProblem 3:\n" + "*************************************************");
        System.out.println("The average of elements from your array above is:" + Arrays.stream(arr).sum()/lenArr);
    /////////////////////////////////////////////////////////////////////////////////////////////////
    //Write a Java program to search for a specific element in an array and return its index.
        System.out.println("\n\nProblem 4:\n" + "*************************************************");
        System.out.println("Please indicate the element from your array used in the first 3 problems to find its index:");
        elementIndex = scanner.nextInt();
        for(i = 0; i< lenArr; i++){
            if(arrIndex[i] == elementIndex){
                index = i;
                System.out.println("Your element is found at array index number " + index);
            }
        }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Write a Java program to find the intersection of two arrays (common elements).
        System.out.println("\n\nProblem 5:\n" + "*************************************************");
        System.out.println("Please insert the length of your both integer arrays to be used for intersection search:");
        lenArr = scanner.nextInt();
        arr1 = new int[lenArr];
        arr2 = new int[lenArr];
        System.out.println("Please insert items for the first array:");
        for(i = 0; i < lenArr; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Please insert items for the second array:");
        for(i = 0; i < lenArr; i++) {
            arr2[i] = scanner.nextInt();
        }
        for(i = 0; i < lenArr; i++){
            for(j = 0; j < lenArr; j++){
                if (arr1[i] == arr2[j]){
                    System.out.println("The common element of both arrays is: " + arr1[i]);
                }
            }
        }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //Write a Java program to merge two sorted arrays into a single sorted array.
        System.out.println("\n\nProblem 6:\n" + "*************************************************");
        System.out.println("Please insert the length of your both sorted integer arrays to be concatenated in one union array:");
        lenArr3 = scanner.nextInt();
        lenArr4 = scanner.nextInt();
        arr3 = new int[lenArr3];
        arr4 = new int[lenArr4];
        arrUnion = new int[lenArr3 + lenArr4];
        System.out.println("Please insert items for the first array:");
        for(i = 0; i < lenArr3; i++) {
            arr3[i] = scanner.nextInt();
        }
        System.out.println("Please insert items for the second array:");
        for(i = 0; i < lenArr4; i++) {
            arr4[i] = scanner.nextInt();
        }
         for(i = 0; i < lenArr3; i++){
             arrUnion[i] = arr3[i];
         }
         j = 0;
         for(i = lenArr3; i < (lenArr3 + lenArr4); i++){
             if(j < lenArr4){
                 arrUnion[i] = arr4[j];
             }
             j++;
         }
        for(i = 0; i < (lenArr3 + lenArr4); i++){
            maxMin = arrUnion[i];
            for(j = i; j < (lenArr3 + lenArr4); j++) {
                if (maxMin <= arrUnion[j]) {
                    arrUnion[i] = maxMin;
                } else {
                    arrUnion[i] = arrUnion[j];
                    arrUnion[j] = maxMin;
                    maxMin = arrUnion[i];
                }
            }
        }
        System.out.println("Your union array sorted ascending is:");
        for(int item : arrUnion){
            System.out.print(item + " ");
        }
    }
}
