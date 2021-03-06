package com.tts;

public class Main {
    public static void displaySum(int a, int b) {
        System.out.println(a + b);
    }
    // this algorithm has a big O of O(1)
    public static void printFirstItem(int[] items) {
        System.out.println(items[0]);
    }
    // this algorithm has a big O of O(n)
    public static void printAllItems(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
    }
    public static void printAllPossibleOrderedPairs(int[] items) {
        for ( int firstItem : items) {
            for (int secondItem : items) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }

    public static void sayHiNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("hi");
        }
    }

    public static int getLargestItem(int[] items) {
        int largest = Integer.MIN_VALUE;
        for (int item : items) {
            if (item > largest) {
                largest = item;
            }
        }
        return largest;
    }




    public static void main(String[] args) {
        System.out.println("***** displaySum *****");
        displaySum(3, 7);

        int[] intArr = {1, 2, 3 , 4, 5};

        System.out.println("***** printFirstItem *****");
        printFirstItem(intArr);

        System.out.println("***** printAllItems *****");
        printAllItems(intArr);

        System.out.println("***** printAllPossibleOrderedPairs *****");
        printAllPossibleOrderedPairs(intArr);

        System.out.println("***** print n times hi*****");
        sayHiNTimes(5);
    }
}





