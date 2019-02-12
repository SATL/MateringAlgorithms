package problems.arrays;

import algorithms_I_princeton.algorithms.search.BinarySearch;

/***
 * Search in a bitonic array.
 * An array is bitonic if it is comprised of an increasing sequence of integers followed immediately by a decreasing sequence of integers. Write a program that, given a bitonic array of nn distinct integer values, determines whether a given integer is in the array.
 */
public class SearchBitonic {


    //1,3,5,6,7,8,1
    //start:4
    //end:6
    //middle = 5
    //value = 8
    private static int getHighValue(int[] arr, int start, int end){
        if(start>=end)
            return -1;

        int middle = start + ((end - start) / 2);

        int value = arr[middle];

        if(value > arr[middle-1] && value > arr[middle+1]){
            return middle;
        }else if( value < arr[middle-1]){
            return getHighValue(arr, start, middle-1);
        }
        else if(value < arr[middle+1]){
            return getHighValue(arr, middle+1, end);
        }

        return -1;
    }



    public static int getElement(int[] arr, int target){
        int higest = getHighValue(arr, 0, arr.length-1);

        int left = BinarySearch.binarySearch(target, arr, 0, higest);
        if(left != -1)
            return left;

        int right = BinarySearch.binarySearchInverse(target, arr, higest, arr.length-1);

        return right;
    }


    public static void main(String[] arr){
        int[] a1 = new int[]{1,3,5,7,9,6,5,4,3,2};
        int aSearch = 5;
        int aSearch2 = 10;
        System.out.println("High value "+getHighValue(a1, 0, a1.length-1));

        System.out.println("Search "+getElement(a1, aSearch));
        System.out.println("Search "+getElement(a1, aSearch2));

    }
}
