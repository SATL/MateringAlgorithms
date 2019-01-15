package algorithms_I_princeton.union_find;

public class WeightedQuickUnion extends QuickUnion {
    int[] sz;

    public WeightedQuickUnion(int n){
        id = new int[n];
        sz = new int[n];

        for(int i=0; i<n; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }


    @Override
    public void union(int p, int q){
        int i=  root(p);
        int j = root(q);

        if(i == j) return;

        if(sz[i] > sz[j]){
            id[j] = i;
            sz[i] +=sz[j];
        }else{
            id[i] = j;
            sz[j] += sz[i];
        }
    }
}
