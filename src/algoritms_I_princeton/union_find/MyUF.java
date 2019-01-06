package algoritms_I_princeton.union_find;


import java.util.List;

/***
 * Test of my iplementation for dynamic connectivity problem
 *
 * list of numbers
 * unite them
 * check if they are connected
 *
 * union(4, 3)
 * union(3, 8)
 * union(6, 5)
 * union(9, 4)
 * union(2, 1)
 * connected(0, 7)
 * connected(8, 9)
 * union(5, 0)
 * union(7, 2)
 * connected(0, 7)
 *
 * 0 parent = 0
 * 1 parent = 2
 * 2 parent = 2
 * 3 parent = 4
 * 4 parent = 9
 * 5 parent = 6
 * 6 parent = 6
 * 7 parent = 7
 * 8 parent = 3
 * 9 parent = 9
 *
 * Item[] items
 * UF(int n){
 *     for i in n
 *          items[i] = new Item(i)
 * }
 * define item{
 *     parent:int
 *     children:[Item] max n, same id
 * }
 *
 * union(int p, int q){
 *     items[q] = p;
 *     //q.childrens.parent = p;
 * }
 *
 * connected(int p, int q){
 *     return getParent(p) == getParent(q);
 * }
 *
 * getParent(int p){
 *     int parent = p;
 *     while(parent.parent != parent) parent = parent.parent;
 *     return parent;
 * }
 *
 */

public class MyUF implements UF {

    private int[] items;

    public MyUF(int n){
        items = new int[n];
        for(int i=0; i<n; ++i) items[i] = i;
    }

    @Override
    public boolean connected(int p, int q) {
        //ToDo: check if items are in range
        return getParent(p) == getParent(q);
    }

    @Override
    public void union(int p, int q) {
        //TODO check if items are in rante
        items[p] = q;
    }

    public int getParent(int p){ //3
        //TODO check if item is in range
        int parent = items[p]; //4
        //9         4
        while(items[parent] != parent){
            parent = items[parent]; //9
        }

        return parent;
    }
}
