package com.playground;

import java.util.Arrays;
import java.util.Comparator;

class ObjectPlayground {

     String[] stringArray = {"one", "two", "three", "four", "five"};
     int[] intArray = { 100, 99, 98 };

     ArrayList<String> cars = new ArrayList<String>();
     cars.add("Ford");
     cars.add("Toyota");

    // constructor
    public ObjectPlayground() {
        System.out.println("I'm a new instance of Object Sandbox.");
    }

    public void arraySortByLengthAndReversed(String[] array) {
        Arrays.sort(array, Comparator.comparing(String::length).reversed());
        System.out.printf("The array has been sorted by length and then reversed: %s%n", Arrays.toString(array));
    }
}
