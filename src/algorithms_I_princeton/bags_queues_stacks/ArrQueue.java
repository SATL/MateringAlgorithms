package algorithms_I_princeton.bags_queues_stacks;

public class ArrQueue {
    int size = 0;
    String arr[] = new String[2];

    int head = 0;
    int tail = 0;


    public void enqueue(String text) {
        if (needGrow()) resize(2 * arr.length);

        arr[tail++] = text;
        if (tail == arr.length) tail = 0;
        size++;
    }

    public String dequeue() {
        String value = arr[head];
        arr[head] = null;
        head++;
        size--;
        if(head == arr.length) head = 0;

        if(needsShirnk())
            resize(arr.length/2);

        return value;
    }

    public boolean needGrow() {
        return size == arr.length;
    }

    public boolean needsShirnk() {
        return size > 0 && size <= arr.length / 4;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void resize(int capacity) {
        String[] newArr = new String[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(head + i) % arr.length];
        }
        arr = newArr;

        head = 0;
        tail = size;
    }


}
