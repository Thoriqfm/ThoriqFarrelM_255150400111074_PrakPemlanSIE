package modul9.searching;

public class Search {

    public static int linearSearch(int[] arr, int search) {
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            check++;
            if (arr[i] == search) {
                System.out.println("Linear search - check: " + check);
                return i;
            }
        }
        System.out.println("Linear search - check: " + check);
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int check = 0;
        int low = 0, high = arr.length - 1;
        while (low < high) {
            check++;
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("Binary search - check: " + check);
                return mid;
            }
            if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Binary search - check: " + check);
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 13, 17, 21, 25, 28, 32, 36,
            39, 43, 47, 51, 54, 58, 61, 65, 68, 72,
            75, 79, 82, 85, 88, 91, 93, 95, 97, 99};

        int linarResult = linearSearch(arr, 88);
        System.out.println("Linear search result - pada index: " + linarResult);

        int linearResult2 = linearSearch(arr, 100); // 100 tidak ada di array
        System.out.println("Linear search result - pada index: " + linearResult2);

        System.out.println();

        int binaryResult = binarySearch(arr, 88);
        System.out.println("Binary search result - pada index: " + binaryResult);

        int binaryResult2 = binarySearch(arr, 100); // 100 tidak ada di array
        System.out.println("Binary search result - pada index: " + binaryResult2);

        System.out.println();

        int hasilLinear = linearSearch(arr, 50);
        System.out.println("Linear Search - index ditemukan: " + hasilLinear);

        int hasilBinary = binarySearch(arr, 50);
        System.out.println("Binary Search - index ditemukan: " + hasilBinary);
    }
}
