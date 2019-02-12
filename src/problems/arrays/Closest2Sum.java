package problems.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 * Problem: Given 2 arrays a & b, find the closets sum of 2 values ( every value for one array ) which ius
 * closest to the target
 */

public class Closest2Sum {

    /**
     * Brute Force Solution
     * iterate all pair of numbers and calculate de difference between the sum if is less add it to the array
     */
    public static int[] closestBF(int[] a, int[] b, int target) {
        int closestValue = Integer.MAX_VALUE;
        int[] result = new int[2];

        for (int i : a) {
            for (int j : b) {
                int sum = i + j;
                int diff = Math.abs(sum - target);
                if (diff < closestValue) {
                    closestValue = diff;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


    /***
     * Closest Hash Solution
     * Add first array to a Set
     * iterate over the second array trying to find the differente in the set
     * if not found difference + 1
     */

    public static int[] closestHash(int[] a, int[] b, int target) {
        int closestValue = Integer.MAX_VALUE;
        int[] result = new int[2];

        Set<Integer> set = new HashSet<Integer>();

        for (int i : a) {
            set.add(i);
        }

        return searchDifference(b, set, target, 0);
    }

    private static int[] searchDifference(int[] b, Set<Integer> set, int target, int difference) {
        for (int i : b) {
            int toSearch = target -difference - i;
            if (set.contains(toSearch)) {
                return new int[]{toSearch, i};
            }
        }

        return searchDifference(b, set, target, difference + 1);
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{-1, 3, 8, 2, 9, 5};
        int[] a2 = new int[]{4, 1, 2, 10, 5, 20};
        int aTarget = 24;

        int[] b1 = new int[]{7, 4, 1, 10};
        int[] b2 = new int[]{4, 5, 8, 7};
        int bTarget = 13;

        System.out.println("Brute Force");
        int[] aSolution = closestBF(a1, a2, aTarget);
        System.out.println("A result:" + aSolution[0] + ", " + aSolution[1]);
        int[] bSolution = closestBF(b1, b2, bTarget);
        System.out.println("B result:" + bSolution[0] + ", " + bSolution[1]);


        System.out.println("============================================");

        System.out.println("Hashing");
        aSolution = closestHash(a1, a2, aTarget);
        System.out.println("A result:" + aSolution[0] + ", " + aSolution[1]);
        bSolution = closestHash(b1, b2, bTarget);
        System.out.println("B result:" + bSolution[0] + ", " + bSolution[1]);
    }
}
