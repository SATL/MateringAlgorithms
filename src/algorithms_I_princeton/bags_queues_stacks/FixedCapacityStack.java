package algorithms_I_princeton.bags_queues_stacks;

public class FixedCapacityStack<E> {
    E[] arr;
    int n = 0;

    public FixedCapacityStack(int size) {
        arr = (E[]) new Object[size];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(E value) {
        arr[n++] = value;
    }

    public E pop() {
        E value = arr[--n];
        arr[n] = null;
        return value;
    }
}
