package algorithms_I_princeton.bags_queues_stacks;

public class LikedStackString {

    public class Node{
        public String value;
        public Node next;

        public Node(String value){
            this.value = value;
        }
    }


    private Node tail = null;


    public boolean isEmpty(){
        return tail == null;
    }

    public void push(String item){
        Node old = tail;
        tail = new Node(item);
        tail.next = old;
    }

    public String pop(){
        String item = tail.value;
        tail = tail.next;
        return item;
    }


}
