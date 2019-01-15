package algorithms_I_princeton.union_find;

import java.lang.reflect.Constructor;

public class MainUnionFind {
    public static void main(String[] args) {
//        int N = StdIn.readInt();
//        UF uf = new UF(N);
//        while (!StdIn.isEmpty())
//        {
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//            if (!uf.uf.connected(p, q))
//            {
//                uf.uf.union(p, q);
//                StdOut.println(p + " " + q);
//            }
//        }
        check(MyUF.class);
        check(QuickFind.class);
        check(QuickUnion.class);
        check(WeightedQuickUnion.class);
    }


    public static void check(Class<?> ufClass) {
        int n = 10;
        System.out.println("Class: " + ufClass.getName());
        try {

            Constructor<?> ctor = ufClass.getConstructor(int.class);
            UF uf = (UF) ctor.newInstance(n);
            uf.union(4, 3);
            uf.union(3, 8);
            uf.union(6, 5);
            uf.union(9, 4);
            uf.union(2, 1);
            boolean check1 = uf.connected(0, 7);
            System.out.println("Check1 " + check1);
            boolean check2 = uf.connected(8, 9);
            System.out.println("Check2 " + check2);

            uf.union(5, 0);
            uf.union(7, 2);
            uf.union(6, 1);
            uf.union(1, 0);

            boolean check3 = uf.connected(0, 7);
            System.out.println("Check3 " + check3);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return;
        }


    }
}
