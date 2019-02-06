package algorithms_I_princeton.algorithms.search;

import edu.princeton.cs.algs4.Stopwatch;

public class BinarySearch {

    /***
     * Find Element in the array using binary Search with a while
     * @param key
     * @param arr
     * @return
     */
    public static int binarySearch(int key, int[] arr){
        if(arr.length == 0)
            return -1;

        int low=0;
        int high = arr.length;

        while(low<=high){
            int mid = low + (high -low) /2;
            if( key < arr[mid]) high = mid -1;
            else if ( key > arr[mid]) low = mid+1;
            else return mid;
        }

        return -1;
    }


    //key = 10
    //low = 1
    //high = 0

    /***
     * Find the key in the array with a low and high parameter, for recursion
     * @param key
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int binarySearch(int key, int arr[], int low, int high){
        if(low>high) return -1;
        int mid = low + (high - low)/2; //0

        if(key < arr[mid]) return binarySearch(key, arr, low, mid-1);
        else if (key > arr[mid]) return binarySearch(key, arr, mid+1, high);
        else return mid;
    }

    /***
     * Find the key in the array using binary Search Recursion
     * @param key
     * @param arr
     * @return
     */
    public static int binarySeachRec(int key , int[] arr){
        if(arr.length == 0)
            return -1;

        return binarySearch(key, arr, 0 , arr.length);
    }


    public static void main(String[] args){
        int[] arr = {6, 13,14,25,33,51};
        int key = 13;

        Stopwatch stopwatch = new Stopwatch();
        System.out.println("Binary Search while: "+binarySearch(key, arr));
        System.out.println("time: "+stopwatch.elapsedTime());

        stopwatch = new Stopwatch();
        System.out.println("Binary Search Recursion: "+binarySeachRec(key, arr));
        System.out.println("time: "+stopwatch.elapsedTime());
    }
}
