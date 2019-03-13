package daily_coding;


/***
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
 * For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 *
 * Given this implementation of cons:
 *
 * def cons(a, b):
 *     def pair(f):
 *         return f(a, b)
 *     return pair
 * Implement car and cdr.
 */
public class ConstructPairs {

    static class Pair{
        int a;
        int b;

        Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    public static Pair cons(int a, int b){
        return new Pair(a, b);
    }

    public static int car(Pair pair){
        return pair.a;
    }

    public static int cdr(Pair pair){
        return pair.b;
    }

    public static void main(String[] args) {

        System.out.println(car(cons(3, 4)));
        System.out.println(cdr(cons(3, 4)));

    }
}
