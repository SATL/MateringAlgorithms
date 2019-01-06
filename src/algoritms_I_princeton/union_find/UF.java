package algoritms_I_princeton.union_find;

/***
 * Given a set of N objects.
 * ・Union command: connect two objects.
 * ・Find/connected query: is there a path connecting the two objects?
 */


public interface UF {

    /**
     * Check if two objects are in the same component.
     * @param p element 1
     * @param q element 2
     * @return if they are connected
     */
    boolean connected(int p, int q);

    /**
     * Replace components containing two objects
     * with their union.
     * @param p element 1
     * @param q element 2
     */
    void union(int p, int q);

}

