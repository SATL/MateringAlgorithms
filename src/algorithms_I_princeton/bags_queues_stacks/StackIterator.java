package algorithms_I_princeton.bags_queues_stacks;

import java.util.Iterator;

public class StackIterator<E> implements Iterable <E>{


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
    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E>{

        Node current = tail;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            /** Todo: Implement exception NoSuchElementException **/
            E item = tail.value;
            current = tail.next;
            return item;
        }
    }

}
