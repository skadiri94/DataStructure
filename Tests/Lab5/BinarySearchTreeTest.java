package Lab5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BinarySearchTreeTest {
    private BinarySearchTree<String> tree;

    @Test
    void insert() {
        tree = new BinarySearchTree();
        tree.insert("Ash");
        tree.insert("Beash");
        boolean result = tree.contains("Beash");
        assertEquals(true,result);

    }

    @Test
    void contains() {
    }
}