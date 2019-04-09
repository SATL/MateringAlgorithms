package hacker_rank.greedy;

import java.util.HashMap;
import java.util.Map;

/****
 * Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool their money to buy ice cream. On any given day, the parlor offers a line of flavors. Each flavor has a cost associated with it.
 *
 * Given the value of  and the  of each flavor for  trips to the Ice Cream Parlor, help Sunny and Johnny choose two distinct flavors such that they spend their entire pool of money during each visit. ID numbers are the 1- based index number associated with a . For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.
 */
public class IceCreamParlor {

    static void whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < cost.length; i++) {
            int x = money - cost[i];
            if (map.containsKey(x)) {
                System.out.println(map.get(x) + " " + (i + 1));
                return;
            }else{
                map.put(cost[i], i+1);
            }
        }
    }

    public static void main(String[] args) {
        whatFlavors(new int[]{1, 4, 5, 3, 2}, 4);

        whatFlavors(new int[]{2,2,4,3}, 4);
    }
}
