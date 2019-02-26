package daily_coding;

/***
 * Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 *
 * You can modify the input array in-place.
 *
 *
 * */


public class FirstMissingPositiveInteger {


    /***
     * Clean the array removing elements lower than 1 , first shift them, then create new array
     * @param arr
     * @return
     */
    public static int[] cleanNegativesAndZero(int[]arr){
        int j=0;

        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            if(val <=0){
                arr[i] = arr[j];
                arr[j++] = val;
            }
        }

        int[] arrClean = new int[arr.length-j];

        for(int i=0; i<arr.length-j; i++){
            arrClean[i] = arr[i+j];
        }

        return arrClean;
    }


    /***
     * Remove lower than 1 values
     * put in the position of the array the value in negative, ex
     * [2, 3, 4]
     * i = 1
     * [2, -3, 4] so we know that that position number exists
     *
     * the iterate over the aray trying to find positive values, if is positive return the position
     * if not return the length +1
     *
     * @param arr
     * @return
     */
    public static int findFirstPositiveInteger(int[] arr){
        arr = cleanNegativesAndZero(arr);
        for(int i=0; i<arr.length; i++){//2
            int x = Math.abs(arr[i]); //0
            if(x-1<arr.length && arr[x-1] > 0){
                arr[x-1] = -arr[x-1];
            }
        }

        for(int i=0; i<arr.length; i++){
            int pos = arr[i];

            if(pos>0)
                return i+1;
        }

        return arr.length+1;
    }


    public static void main(String[] args) {
        int[] arr1 = {3,4,-1,1};
        int[] arr2 = {1,2,0};

        System.out.println(findFirstPositiveInteger(arr1));
        System.out.println(findFirstPositiveInteger(arr2));
    }
}
