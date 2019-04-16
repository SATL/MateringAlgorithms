package hacker_rank.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 * u will be given an array of integers and a target value. Determine the number of pairs of array elements that have a difference equal to a target value.
 *
 * For example, given an array of [1, 2, 3, 4] and a target value of 1, we have three values meeting the condition:
 * 2-1=1, 3-2=4 and 4-3=1
 */
public class Pairs {

    static int pairs(int k, int[] arr) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i:arr)
            set.add(i);

        int count = 0;

        for(int i:arr){
            int elem = i-k;
            if(set.contains(elem))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(pairs(2, new int[]{1, 5, 3, 4, 2}));
    }
}
