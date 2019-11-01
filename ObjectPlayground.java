package com.playground;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class ObjectPlayground {

     String[] stringArray = {"one", "two", "three", "four", "five"};
     int[] intArray = { 100, 99, 98 };

     ArrayList<String> cars = new ArrayList<String>();
//     cars.add("Ford");
//     cars.add("Toyota");

    // constructor
    public ObjectPlayground() {
        System.out.println("I'm a new instance of ObjectPlayground.");
    }

    public void arraySortByLengthAndReversed(String[] array) {
        Arrays.sort(array, Comparator.comparing(String::length).reversed());
        System.out.printf("The array has been sorted by length and then reversed: %s%n", Arrays.toString(array));
    }

    public void createListAndPrintToConsole(String... args) {
        List<String> personsList = new ArrayList<>();

        if (args.length > 0) {
            for (String person : args) {
                personsList.add(person);
            }
        }

        System.out.printf("Here's the list of folks you added: %s%n", personsList.toString() );
    }

    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String SUPPER = "supper";

    /**
     * Important methods to remember:
     * get
     * remove
     * containsKey
     * containsValue
     * size
     *
     * Gotchas:
     * 1.) Can't have duplicate keys. Entries will get over-written
     * 2.) Use constants for keys (best practice)
     */

    public Map createMapAndPrintToConsole() {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "pancakes");
        meals.put(LUNCH, "enchiladas");
        meals.put(SUPPER, "beans & rice");
        return meals;
    }
}

//public interface Flight {
//    /**
//     * Allows two declarations
//     * 1.) Add constants
//     * 2.) Add methods
//     */
//    void fly();
//}
//
//class Bird implements Flight{
//
//    @Override
//    public void fly() {
//        System.out.printf("I'm a bird and I'm flying!%n");
//    }
//
//}
