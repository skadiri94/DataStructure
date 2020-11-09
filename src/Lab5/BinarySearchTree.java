package Lab5;

import java.util.Deque;
import java.util.LinkedList;

public class BinarySearchTree <E extends Comparable> {

    private class Node {
        public E data;
        public Node left;
        public Node right;

    }

    private Node root;


    public BinarySearchTree() {
        root = null;
    }

    public void insert(E element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right = null;
        if (root == null)
            root = newNode;
        else insertSub(newNode, root);
    }

    private void insertSub(Node newNode, Node node) {
        int result = newNode.data.compareTo(node.data);
        if (result == 0) {

        } else if (result > 0) {
            //go right
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertSub(newNode, node.right);
            }
        } else {
            //go left
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertSub(newNode, node.left);
            }
        }
    }

    public boolean contains(E element) {
        boolean found = false;

        Node current = root;

        while (current != null && !found) {
            int result = element.compareTo(current.data);
            if (result == 0)
                found = true;
            else if (result < 0)
                current = current.left;
            else
                current = current.right;
        }

        return found;

    }

    public void print() {
        if (root != null)
            printSub(root);
    }

    public void printSub(Node node) {
        if (node != null) {
            printSub(node.left);
            System.out.println(node.data);
            printSub(node.right);
        }


}
    public void printPreOrderIteratively() {
        Deque<Node> stack = new LinkedList<>();
        stack.addFirst(root);

        while(!stack.isEmpty()){
           Node node = stack.removeFirst();
            System.out.println(node.data);
            if(node.right != null)
                stack.addFirst(node.right);
            if(node.left != null)
                stack.addFirst(node.left);

    }

    }

}
