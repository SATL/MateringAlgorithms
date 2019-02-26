package daily_coding;

import java.util.ArrayList;
import java.util.List;

/***
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
 *
 * For example, given the following Node class
 *
 * class Node:
 *     def __init__(self, val, left=None, right=None):
 *         self.val = val
 *         self.left = left
 *         self.right = right
 * The following test should pass:
 *
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 */

public class SerializeNode {

    static class Node{
        public Node left;
        public Node right;
        public String value;

        Node(String value){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    static String NULL_MARKER = "-";
    static String SEP_MARKER=",";


    public static Node deserialize(String txt){
        String[]arr = txt.split(",");
        List<String> list = new ArrayList<>();
        for(String item : arr)
            list.add(item);

        return deserialize(list);
    }

    public static Node deserialize(List<String> list){
        String val = list.get(0);
        if(val.equals(NULL_MARKER))
            return null;

        Node node = new Node(val);
        list.remove(0);

        node.left = deserialize(list);
        node.right = deserialize(list);

        return node;
    }


    public static String serialize(Node node){
        String ret = "";

        if(node == null)
            return NULL_MARKER;

        ret+=node.value;

        ret+=SEP_MARKER+serialize(node.left);
        ret+=SEP_MARKER+serialize(node.right);

        return ret;
    }

    public static void main(String[] args){
        Node left = new Node("left");
        Node left2 = new Node("left 2");
        left.left = left2;
        Node right = new Node("right");

        Node root = new Node("root");
        root.left = left;
        root.right = right;

        String serialize = serialize(root);
        System.out.println(serialize);

        System.out.println(deserialize(serialize).left.left.value);
    }
}
