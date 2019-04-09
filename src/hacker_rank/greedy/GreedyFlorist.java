package hacker_rank.greedy;


import java.util.Arrays;

/****
 * A group of friends want to buy a bouquet of flowers. The florist wants to maximize his number of new customers and the money he makes. To do this, he decides he'll multiply the price of each flower by the number of that customer's previously purchased flowers plus . The first flower will be original price, , the next will be  and so on.
 *
 * Given the size of the group of friends, the number of flowers they want to purchase and the original prices of the flowers, determine the minimum cost to purchase all of the flowers.
 */
public class GreedyFlorist {


    /***
     * Solution:
     * The main idea is to get first the most expensive flowers and at the end the less expensives
     * To do that first i sort the array. We supuse that we want more flowers that they have
     *
     * then we get the flowers in reverse order n-i-1;
     * to calculta the value added we do a ceil of the count/total of friends
     * @param k
     * @param c
     * @return
     */

    static int getMinimumCost(int k, int[] c){
        Arrays.sort(c);

        int n = c.length;

        int count = 0;
        int sum = 0;
        for(int i=0; i<c.length; i++){
            int x = k-1-i;
            int val = c[x];

            int toAdd = (int) Math.ceil(count/k);
            System.out.printf("%d %d %d \n", count, k, toAdd);

            sum+=(1+toAdd)*val;
            count++;
        }

        return sum;
    }

    public static void main(String[] args) {
        assert getMinimumCost(3, new int[]{2,5,6})== 13;
    }
}
