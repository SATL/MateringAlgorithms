package algorithms_I_princeton.bags_queues_stacks;

public class ResizeArrStackString {

    String[] arr = new String[1];
    int n = 0;


    public void push(String item) {
        if (needsToGrowth()) resize(capacityToIncrease());
        arr[n++] = item;
    }

    private boolean needsToGrowth() {
        return n == arr.length;
    }

    private int capacityToIncrease() {
        return arr.length * 2;
    }

    public void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        arr = copy;
    }

    public String pop() {
        String item = arr[--n];
        arr[n] = null;

        if(needsShrink())
            resize(capacityToShrink());
        return item;
    }

    private boolean needsShrink(){
        return n>0 && n == arr.length/4;
    }

    private int capacityToShrink(){
        return arr.length/2;
    }


}
