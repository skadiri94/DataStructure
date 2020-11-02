package Lab5;

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
        if(result >= 0){
            //go right
            if(node.right == null){
                node.right = newNode;
            }else {
                insertSub(newNode, node.right);
            }
        }
        else{
            //go left
            if(node.left == null){
                node.left = newNode;
            }else {
                insertSub(newNode, node.left);
            }
        }
    }

}
