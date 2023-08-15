package org.example;

public class MergeSorting {
    public int[] merge(int[] array, int aBegin, int aEnd, int bEnd) {
        int[] result = new int[array.length];
        int positionA = 0;
        int indexEndA = aEnd - 1;
        int positionB = aEnd;
        int indexEndB = bEnd - 1;
        for (int i = 0; i < result.length; i++) {
            if (positionA > indexEndA) {
                result[i] = array[positionB];
                positionB++;
            } else if (positionB > indexEndB) {
                result[i] = array[positionA];
                positionA++;
            } else if (array[positionA] < array[positionB]) {
                result[i] = array[positionA];
                positionA++;
            } else {
                result[i] = array[positionB];
                positionB++;
            }
        }
        return result;
    }
}
