package Lab1;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        //   JOptionPane.showMessageDialog(null, "Hit return to continue");
        List<String> arrList = new ArrayList();
        List<String> linkList = new LinkedList();
        int listSize = 100000; // 10 is first value, then 100, etc

        int reps = 10;  // will need to experiment with value for reps

        //populate both lists with contents of a data file
        try {   // The name of the file which we will read from
            // String filename = "words_alpha.txt"; //file in project folder
            String filename = "C:\\Users\\t00204198\\Desktop\\words_alpha.txt"; //can have file in any folder

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            for (int i = 0; i < listSize; i++) {
                // Read one string from the file
                String str = in.nextLine();

                // add str to ArrayList and LinkedList
                arrList.add(str);
                linkList.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        // generate random numbers to use as indices for get method
        // same random numbers used for ArrayList and LinkedList
        int[] randomNos = generateRandomNos(listSize, reps);

        // call testGetForArrayList, testGetForLinkedList,  testSetForArrayList etc to test get, set, insert and remove for ArrayList and LinkedList.

        // to be completed
        long startTime = System.nanoTime();
        testGetForArrayList(arrList, randomNos);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Get Time for ArrayList: " + duration);

        //Time for Linked List

        startTime = System.nanoTime();
        testGetForLinkedList(linkList, randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Get Time for LinkedList: " + duration);


        // testing set for both array and linked list
        startTime = System.nanoTime();
        testSetForArrayList(arrList, randomNos);
         endTime = System.nanoTime();
         duration = endTime - startTime;
        System.out.println("Set Time for ArrayList: " + duration);

        //Time for Linked List

        startTime = System.nanoTime();
        testSetForLinkedList(linkList, randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Set Time for LinkedList: " + duration);

        // testing insert for both array and linked list
        startTime = System.nanoTime();
        testInsertForArrayList(arrList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Insert Time for ArrayList: " + duration);

        //Time for Linked List

        startTime = System.nanoTime();
        testInsertForLinkedList(linkList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Insert Time for LinkedList: " + duration);

        // testing remove for both array and linked list
         startTime = System.nanoTime();
        testRemoveForArrayList(arrList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Remove Time for ArrayList: " + duration);

        //Time for Linked List

        startTime = System.nanoTime();
        testRemoveForLinkedList(linkList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Remove Time for LinkedList: " + duration);



    }


    public static void testGetForArrayList(List list, int[] randomNos) {
        testGetForList(list, randomNos);
    }

    public static void testGetForLinkedList(List list, int[] randomNos) {
        testGetForList(list, randomNos);
    }

    public static void testGetForList(List list, int[] randomNos) {
        // call get on list multiple times
        for (int i = 0; i < randomNos.length; i++) {
            list.get(randomNos[i]);
        }


    }


    public static int[] generateRandomNos(int listSize, int reps) {
        Random random = new Random();
        int[] randomNos = new int[reps];

        for (int i = 0; i < reps; i++) {
            randomNos[i] = random.nextInt(listSize);
        }
        return randomNos;
    }

    public static void testSetForList(List list, int[] randomNos) {
        for (int i = 0; i < randomNos.length; i++) {
            list.set(randomNos[i], "test");  // any String value will do
        }

    }

    public static void testInsertForList(List list) {
        int reps = 5; //need to experiment with values here*/
        for (int i = 0; i < reps; i++)
            list.add(5, "test"); // use 5 to minimize random-access cost, 5 an arbitrary number
    }


    public static void testRemoveForList(List list) {
        while (list.size() > 5)
            list.remove(5); // Use 5 to minimize random access cost // 5 an arbitrary number
    }

    public static void testSetForArrayList(List list, int[] randomNos) {

        testSetForList(list, randomNos);

    }
    public static void testSetForLinkedList(List list, int[] randomNos) {

        testSetForList(list, randomNos);
    }

    public static void testInsertForArrayList(List list) {
       testInsertForList(list);
    }

    public static void testInsertForLinkedList(List list) {
        testInsertForList(list);
    }

    public static void testRemoveForArrayList(List list) {
       testRemoveForList(list);
    }

    public static void testRemoveForLinkedList(List list) {
        testRemoveForList(list);
    }

}