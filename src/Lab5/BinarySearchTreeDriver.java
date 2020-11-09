package Lab5;

public class BinarySearchTreeDriver {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree();

        tree.insert("Ben");
        tree.insert("Alan");
        tree.insert("Amay");
        tree.insert("Kay");
        tree.insert("Bill");
        tree.printPreOrderIteratively();

    }
}
