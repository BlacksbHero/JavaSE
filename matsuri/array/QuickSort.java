package com.matsuri.array;

public class QuickSort {
    private static void swap(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void subSort(int[] data, int start, int end){
        if (start < end){
            int index = data[start];
            int low = start;
            int high = end + 1;
            while (true){
                while (low < end && data[++low] - index <= 0)
                    ;
                while (high > start && data[--high] - index >= 0)
                    ;
                if (low < high){
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, start, high);

            subSort(data, start, high - 1);
            subSort(data, high + 1, end);
        }
    }

    public static void quickSort(int[] data){
        subSort(data, 0, data.length - 1);
    }
}
