package algorithms_I_princeton.union_find;

public class QuickFind implements UF{

    int[] items;
    public QuickFind(int n){
        items = new int[n];
        for(int i=0; i<n; ++i)  items[i] = i;
    }

    @Override
    public boolean connected(int p, int q) {
        return items[p] == items[q];
    }

    @Override
    public void union(int p, int q) {
        int toChange = items[p];
        int value = items[q];
        for(int i=0; i< items.length; i++){
            if(items[i] ==toChange) items[i] = value;
        }
    }
}
