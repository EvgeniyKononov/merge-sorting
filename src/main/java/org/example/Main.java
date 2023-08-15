package org.example;

public class Main {
    public static void main(String[] args) {
        MergeSorting testSorting = new MergeSorting();
        int[] result = testSorting.merge(new int[]{7, 8, 4, 9}, 1, 2, 4);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}