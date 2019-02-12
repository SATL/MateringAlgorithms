package cs_interdisciplinaryapproach.data_types;

/****
 *
 * prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice)
 */

class SumOfTwoDice{

    /****
     *
     * @param limit
     * @return random integer from 0 to limit
     */

    public static int getRandom(int limit){
        return 1+ (int) (Math.random() * limit);
    }

    public static void main(String[] args){

        int sides = 6;

        int a = getRandom(sides);
        int b = getRandom(sides);

        int c = a+b;

        System.out.println(a+"+"+b+" = "+c);

    }
}