package Lab5;

public class BinarySearchTreeDriver {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree();

        tree.insert("Juliet");
        tree.insert("Tom");
        tree.insert("Romeo");
        tree.insert("Diana");
        tree.insert("Harry");
        tree.print();

    }
}
