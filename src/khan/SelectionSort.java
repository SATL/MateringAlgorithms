package khan;

public class SelectionSort {

    public static int indexOfMinimum(int[] arr, int startIdx) {
        int minValue = arr[startIdx];
        int idx = startIdx;

        for (int i = idx + 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                idx = i;
            }
        }

        return idx;
    }

    public static void swap(int[] arr, int indexA, int indexB) {
        int val = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = val;
    }


    /***
     * XOR Overload
     * @param arr
     * @param a
     * @param b
     */
    public static void swap2(int[] arr, int a, int b){
        arr[a] = (arr[a] + arr[b]) - (arr[b] = arr[a]);
    }


    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idx = indexOfMinimum(arr, i);
            if (idx != i) {
                swap2(arr, i, idx);
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] array = {22, 11, 99, 88, 9, 7, 42};
        selectionSort(array);


        for(int i:array){
            System.out.println(i);
        }

    }
}
