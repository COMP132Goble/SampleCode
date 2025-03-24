package sorting;

public class SelectionSort {
    public static int[] iterativeSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = findIndexOfMin(arr, i);
            swap(arr, i, minIndex);
        }
        return arr;
    }

    private static int findIndexOfMin(int[] arr, int start) {
        int target = start;
        for (int i = start + 1; i < arr.length; i++) {
            if(arr[i] < arr[target]) {
                target = i;
            }
        }
        return target;
    }

    private static void swap(int[] arr, int val1, int val2) {
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }

    public static void main(String[] args) {
        int[] small = ArrayTools.getRandomIntArray(0, 10000, 10);
        int[] medium = ArrayTools.getRandomIntArray(0, 10000, 10000);
        int[] large = ArrayTools.getRandomIntArray(0, 10000, 50000);
        testArrs(small);
    }

    public static void testArrs(int[] arr) {
        ArrayTools.printIntArray(arr);
        arr = iterativeSort(arr);
        ArrayTools.printIntArray(arr);
    }
}
