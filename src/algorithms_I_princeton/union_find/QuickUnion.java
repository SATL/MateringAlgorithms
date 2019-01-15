package algorithms_I_princeton.union_find;

public class QuickUnion implements UF {
    int[] id;

    public QuickUnion(){}

    public QuickUnion(int n){
        id = new int[n];
        for(int i=0; i<n; i++)
            id[i]=i;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public int root(int i){
        while( i != id[i]) i = id[i];
        return i;
    }
}
