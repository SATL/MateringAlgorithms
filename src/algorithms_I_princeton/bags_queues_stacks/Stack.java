package algorithms_I_princeton.bags_queues_stacks;

public class Stack<E> {
    public class Node{
        public E value;
        public Node next;
        public Node(E value){
            this.value = value;
        }
    }


    private Node tail = null;


    public boolean isEmpty(){
        return tail == null;
    }

    public void push(E item){
        Node old = tail;
        tail = new Node(item);
        tail.next = old;
    }

    public E pop(){
        E item = tail.value;
        tail = tail.next;
        return item;
    }
}
