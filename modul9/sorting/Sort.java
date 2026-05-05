package modul9.sorting;

import java.util.Arrays;

public class Sort {

    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                System.out.printf("%d:%d\n", list[k], list[i]);
                if (list[k] > list[i]) { // Ubah dari < menjadi > (descending)
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++;
                }
            }
        }
        System.out.println("Bubble - tukar atau geser: " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            /*
            * Move elements of arr[0..i-1], that are greater than key,
            * to one position ahead of their current position
             */
            while (k >= 0 && list[k] < key) { // Ubah dari > menjadi < (descending)
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++;
            }
            list[k + 1] = key;
        }
        System.out.println("Insertion - tukar atau geser: " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) { 
        int tukarAtauGeser = 0;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[minIndex]) { // Ubah dari < menjadi > (descending)
                    minIndex = k;
                }
            }
            // Swap the found minimum element
            // with the first element
            int t = list[minIndex];
            list[minIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++;
        }
        System.out.println("Selection - tukar atau geser: " + tukarAtauGeser);
        return list;
    }

    public static void main(String[] args) {
        // ubah nilai default Array ini menjadi sebanyak 30 elemen
        // acak/tidak terurut dan nilai elemennya tidak ada yang ganda.
        // int[] data = {10, 5, 15, 8, 3};

        // // System.out.println("Bubble Sort: " + Arrays.toString(bubble(data.clone())));
        // // System.out.println("Insertion Sort: " + Arrays.toString(insertion(data.clone())));
        // // System.out.println("Selection Sort: " + Arrays.toString(selection(data.clone())));

        // int[] sorted = bubble(data);
        // int[] sorted2 = insertion(data);
        // int[] sorted3 = selection(data);

        // System.out.println(Arrays.toString(sorted));
        // System.out.println(Arrays.toString(sorted2));
        // System.out.println(Arrays.toString(sorted3));

        // System.out.println();

        int[] arr = {42, 7, 85, 13, 67, 34, 91, 28, 56, 3,
            74, 19, 48, 62, 5, 88, 31, 77, 23, 95,
            11, 53, 39, 70, 16, 82, 44, 60, 26, 99};

        System.out.println("Sebelum diurutkan:");
        System.out.println(Arrays.toString(arr));

        System.out.println("\n--- Bubble Sort ---");
        System.out.println("Hasil: " + Arrays.toString(bubble(arr.clone())));

        System.out.println("\n--- Insertion Sort ---");
        System.out.println("Hasil: " + Arrays.toString(insertion(arr.clone())));

        System.out.println("\n--- Selection Sort ---");
        System.out.println("Hasil: " + Arrays.toString(selection(arr.clone())));

    }
}
