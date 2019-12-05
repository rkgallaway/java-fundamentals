/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static java.lang.Math.random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    // feature #1: roll dice and contain results in an array
    public static int[] roll(int n) {
        int[] rolls = new int[n];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = randomNumberOneToSix();
        }
        return rolls;
    }

    // this helper function makes testing easier
    public static int randomNumberOneToSix() {
        int num = (int) Math.ceil(6 * Math.random());
        return num;
    }

    // detect duplicates
    public static boolean containsDuplicates(int[] results) {
        for (int i = 0; i < results.length; i++) {
            int value = results[i];
            for (int j = 0; j < results.length; j++) {
                if (i != j && results[j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    // calculate averages
    public static int calculateAverage(int[] intArr) {
        if (intArr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int element : intArr) {
            sum += element;
        }
        sum = sum / intArr.length;
        return sum;
    }

    // Array of Arrays
    public static int[] lowestAverage(int[][] intArr) {
        int[] lowestAverageArray = intArr[0];
        for (int[] subArray : intArr) {
            if (calculateAverage(subArray) < calculateAverage(lowestAverageArray)) {
                lowestAverageArray = subArray;
            }
        }
        return lowestAverageArray;
    }

    // ArrayList practice
    // allows adding and removing data --growing/shrinking, CANNOT hold primitive values
    public static boolean someArrayList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("David");
        names.add("Jon");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (String name : names) {
            System.out.println(name);
        }


        // want to store primitives?  use Object wrapper class, java will handle the rest
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        return true;
    }

    // HashMap: in js similar to objects / dictionaries.  holds key value pairs -NOT in order
    // all keys and all values are same data type
    public static boolean someHashMap() {
        HashMap<String, Integer> shoeSizes = new HashMap<>();
        shoeSizes.put("Michelle", 9);
        shoeSizes.put("Ryan", 11);
        shoeSizes.put("Lorraine", 14);

        for (String name : shoeSizes.keySet()) {
            System.out.println(name + ": " + shoeSizes.get(name));
        }
        System.out.println("-------------------------");
        for (String name : shoeSizes.keySet()) {
            String answer = String.format("%s: %d", name, shoeSizes.get(name));
            System.out.println(answer);
        }


        return true;
    }

    // HashSet:  unordered collection.  NOT holding Key Vale pairs.  NOT holding in order.
    // only checks if contained or not:  keys only -pool ball analogy, grab a ball from the bag
    public static boolean someHashSet() {
        String[] myGarden = new String[]{"peas", "green beans", "tomatoes", "peppers", "beets", "lettuce", "blueberries", "huckleberries", "grapes", "strawberries"};
        int fruitCount = 0;
        //dork around with HashSet here
        HashSet<String> fruits = new HashSet<>();
        fruits.add("blueberries");
        fruits.add("huckleberries");
        fruits.add("raspberries");
        fruits.add("blackberries");
        fruits.add("grapes");
        fruits.add("strawberries");

        for (String fruit : myGarden) {
            if (fruits.contains(fruit)) {
                fruitCount++;
            }
        }
        System.out.println("My garden contains " + fruitCount + " types of fruit");
        return true;
    }

    public static int findMinimumValue(int[] intArr) {
        int minimumValue = intArr[0];
        for (int value : intArr) {
            if (value < minimumValue) {
                minimumValue = value;
            }
        }
        return minimumValue;
    }

    public static int findMaximumValue(int[] intArr) {
        int maximumValue = intArr[0];
        for (int value : intArr) {
            if (value > maximumValue) {
                maximumValue = value;
            }
        }
        return maximumValue;
    }

//    public static int[] findPossibleTemps (int low, int high) {
//        int arrayLength = (high - low) + 1;
//        int[] intArr = new int[arrayLength];
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = low; j < high; j++) {
//                intArr[i] = j;
//            }
//        }
//            return intArr;
//    }


    public static boolean analyzeWeatherData (int[][] data) {

        int high = data[0][0];
        int low = data[0][0];
        HashSet<Integer> dailyTemperatures = new HashSet<>();

        // find actual high and low and insert daily temp into HashSet
        for (int[] weekTemps : data) {
            for (int dayTemp : weekTemps) {
                if (dayTemp < low) {
                    low = dayTemp;
                }
                if (dayTemp > high) {
                    high = dayTemp;
                }
                dailyTemperatures.add(dayTemp);
            }
        }

        // print out return
        System.out.println("High: " + high);
        System.out.println("Low: " + low);

        for (int i = low; i < high; i++) {
            if (!dailyTemperatures.contains(i)) {
                System.out.println("Never saw temperature: " + i);
            }
        }
        //how would I test??  and confirm exact output from the println.  use hasMap for high and low?  use hashSet for unseen temps?  break them apart into smaller functions and confirm with those function returns?  call those functions in a render function?
        return true;
    }

    public static String tally(ArrayList votes){

        // create hashMap
        // insert each candidate into HashMap, start with vote 1, and increment on reoccur
        // return key with highest value
        String results = "null";

        return results;
    }
}
