package algorithms_I_princeton.bags_queues_stacks;

public class LinkedQueque {
    static class Node {
        Node next;
        String value;

        Node(String value) {
            this.value = value;
        }
    }


    int size = 0;
    Node head;
    Node tail;

    void enqueue(String item) {
        Node node = new Node(item);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

    }

    void enqueue2(String item) {
        Node oldLast = tail;

        tail = new Node(item);
        if(isEmpty()){
            head = tail;
        }else{
            oldLast.next = tail;
        }

    }

    public String dequeue() {
        Node first = head;
        head = first.next;

        if(isEmpty()){
            tail = null;
        }

        return first.value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }


    public static void main(String[] args) {

    }
}
