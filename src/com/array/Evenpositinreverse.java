package com.array;

public class Evenpositinreverse {
    public static void main(String[] args) {
        //initilizing the array
        int[] arr = {5, 6, 7, 8, 9, 10};
        System.out.println("Array in reverse order: ");
        //to get array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
