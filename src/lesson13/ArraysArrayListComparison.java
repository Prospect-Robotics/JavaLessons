package lesson13;

import java.util.ArrayList;
import java.util.List;

public class ArraysArrayListComparison {
    public static void main(String[] args) {
        // initializing
        int[] myArray = new int[];
        List<Integer> myList = new ArrayList<>();

        // setting element
        myArray[0] = 5;
        myList.set(0, 5);

        // getting an element
        System.out.println("myArray[0]: " + myArray[0]);
        System.out.println("myList.get(0): " + myList.get(0));

        // getting size
        System.out.println("myArray.length " + myArray.length);
        System.out.println("myList.size(): " + myList.size());

        // adding element
        // myArray[4] = 0; NOT ALLOWED
        myList.add(0); // ALLOWED
    }
}
