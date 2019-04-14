package khan;

public class InsertionSort {

    public static void insert(int[] arr, int rightIndex, int value) {
        int i = rightIndex;
        for (;
             i >= 0 && arr[i] > value;
             i--) {
            arr[i + 1] = arr[i];
        }

        arr[i + 1] = value;
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insert(arr, i - 1, arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 11, 13, 2, 9, 6};

        insert(array, 4, 2);
        System.out.println("Array after inserting 2:  ");
        for (int i : array) {
            System.out.printf("%d, ", i);
        }

        System.out.println();
        assert (array == new int[]{2, 3, 5, 7, 11, 13, 9, 6});

        var array2 = new int[]{22, 11, 99, 88, 9, 7, 42};

        insertionSort(array2);
        for (int i : array2) {
            System.out.printf("%d, ", i);
        }

    }

}
