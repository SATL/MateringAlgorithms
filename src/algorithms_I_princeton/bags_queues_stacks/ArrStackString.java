package algorithms_I_princeton.bags_queues_stacks;

public class ArrStackString {

    String[] arr;
    int n = 0;

    public ArrStackString(int size){
        arr = new String[size];
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void push(String value){
        arr[n++] = value;
    }

    public String pop(){
        String value = arr[--n];
        arr[n] = null;
        return value;
    }
}
