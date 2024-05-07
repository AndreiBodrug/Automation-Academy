package Homework020524;

import java.util.*;
import java.util.regex.Pattern;

public class Homework020524 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        HashSet<Integer> arr3 = new HashSet<>();
        ArrayList<String> arr4 = new ArrayList<>();
        HashMap<String, String > set = new HashMap<>();
        int n, element2;
        String element1, keyCountry, valueCapital;
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Scanner scanner = new Scanner(System.in);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 1
        System.out.println("Task 1");
        System.out.println("Please provide the number of elements of your array list for task 1:");
        n = scanner.nextInt();
        System.out.println("Please provide your string elements for your array list (some elements should be randomly integer):");
        for(int i = 0; i < n; i++){
            element1 = scanner.nextLine();
            arr1.add(element1);
        }
        for(String j : arr1){
            if(pattern.matcher(j).matches()){
                arr2.add(j);
            }
        }
        System.out.println("Your array list with only integer numbers is:\n");
        System.out.println(arr2);
        System.out.println("****************************************************************************");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 2
        System.out.println("Task 2");
        System.out.println("Please provide the number of elements of your array list for task 2:");
        n = scanner.nextInt();
        System.out.println("Please provide your integer elements for your array list (with duplicates):");
        for(int i = 0; i < n; i++){
            element2 = scanner.nextInt();
            arr3.add(element2);
        }
        System.out.println("Your array list without any duplicate is:\n");
        System.out.println(arr3);
        System.out.println("****************************************************************************");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 3
        System.out.println("Task 3");
        System.out.println("Please provide the number of pairs of your map list for task 3:");
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please provide your pairs of countries and their capitals (Country -> Capital):");
        for(int i = 0; i < n; i++){
            keyCountry = scanner.nextLine();
            valueCapital = scanner.nextLine();
            set.put(keyCountry, valueCapital);
        }
        System.out.println("Please choose 1 or 2 by which key/value should be sorted your map list:\n1. By key\n2. By value\n");
        n = scanner.nextInt();
        MapIteration(n, set);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Method for task 3
    public static void MapIteration(int whichMethod, HashMap<String, String> set1){
        TreeMap<String,String> newMap = new  TreeMap<String,String> (set1);

        if(whichMethod == 1){
            Iterator iterator = newMap.keySet().iterator();
            while(iterator.hasNext()){
                String key = (String) iterator.next();
                System.out.println("Country: " + key + " Capital: " + set1.get(key));
            }
        }else if(whichMethod == 2){
            ArrayList<String> arr = new ArrayList<>();
            for(String j : set1.values()){
                arr.add(j);
                arr.stream().sorted();
            }
            for(String j : arr){
                for(Map.Entry<String, String> entry: set1.entrySet()){
                    if(entry.getValue() == j){
                        System.out.println("Country: " + entry.getKey() + " Capital: " + j);
                    }
                }
            }
        }
    }
}
