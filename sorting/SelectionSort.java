package sorting;

public class SelectionSort {
    public static int[] iterativeSort(int[] arr) {
        return null;
    }

    private static int findIndexOfMin(int[] arr, int start) {
        return 0;
    }

    private static void swap(int[] arr, int val1, int val2) {
        
    }

    public static void main(String[] args) {
        int[] small = ArrayTools.getRandomIntArray(0, 10000, 10);
        int[] medium = ArrayTools.getRandomIntArray(0, 10000, 10000);
        int[] large = ArrayTools.getRandomIntArray(0, 10000, 50000);
        testArrs(small);
    }

    public static void testArrs(int[] arr) {
        ArrayTools.printIntArray(arr);
        // arr = iterativeSort(arr);
        // ArrayTools.printIntArray(arr);
    }
}
