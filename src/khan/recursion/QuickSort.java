package khan.recursion;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {


    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    public static int partition(int[] array, int q, int r){
        var p = q;

        for(int j=p; j<r; j++){
            if(array[j]<=array[r]){
                swap(array, q, j);
                q++;
            }
        }
        swap(array, q,r );
        return q;
    }

    public static void quickSort(int[] array, int p, int r){
        if(p<r){
            int pivot = partition(array, p, r);
            quickSort(array, p, pivot-1);
            quickSort(array, pivot+1, r);
        }
    }

    public static void show(int[] array){
        for(int i:array){
            System.out.print(i+", ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[] array = new int[]{9, 7, 5, 11, 12, 2, 14, 3, 10, 4, 6};
        show(array);
        quickSort(array, 0, array.length-1);
        show(array);

        int[] array2 = new int[]{5,2,4,6,1};
        show(array2);
        quickSort(array2, 0, array2.length-1);
        show(array2);
    }
}
