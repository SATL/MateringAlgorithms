package algorithms_I_princeton.algorithms.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 * Problem: Given an array, find if is a triplet in array whose sum is equal to 0
 * a+b+c = 0
 */
public class ThreeSum {


    /***
     * Algorithm: Sort the array and do a binary seach for the 3rd element
     */
    public static boolean ThreeSumSorted(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                //c = -(a+b)
                int c = -(a + b);
                int idx = Arrays.binarySearch(arr, c);
                if (idx > -1)
                    return true;
            }
        }

        return false;
    }

    /***
     * Add in each iteration to the Set and the find It
     */
    public static boolean ThreeSumCached(int[] arr){
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                //c = -(a+b)
                int c = -(a + b);
                if(set.contains(c))
                    return true;
                set.add(a);
                set.add(b);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int[] arr2 = { 1, 2, 3, 1};

        System.out.println("ThreeSum Sorted, " + ThreeSumSorted(arr));
        System.out.println("ThreeSum Sorted negative, " + ThreeSumSorted(arr2));

        System.out.println("ThreeSum Cached " + ThreeSumCached(arr));
        System.out.println("ThreeSum Cached, negative " + ThreeSumCached(arr2));
    }
}
