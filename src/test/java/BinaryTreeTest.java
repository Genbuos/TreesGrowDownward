import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {
    private TreeOneZero tree;

    @BeforeEach
    void setUp() {
        tree = new TreeOneZero();
    }

    @Test
    void testInsertIntoEmptyTree() {
        // Test inserting into an empty tree
        tree.add(10);
        assertEquals(10, tree.root.value);
    }

    @Test
    void testInsertLeftChild() {
        // Test inserting a value smaller than the root (left child)
        tree.add(10);
        tree.add(5);
        assertEquals(5, tree.root.left.value);
    }

    @Test
    void testInsertRightChild() {
        // Test inserting a value larger than the root (right child)
        tree.add(10);
        tree.add(15);
        assertEquals(15, tree.root.right.value);
    }

    @Test
    void testInsertLeftAndRightChildren() {
        // Test inserting both left and right children
        tree.add(10);
        tree.add(5);
        tree.add(15);
        assertEquals(5, tree.root.left.value);
        assertEquals(15, tree.root.right.value);
    }

    @Test
    void testInsertDuplicateValue() {
        // Test trying to insert a duplicate value
        tree.add(10);
        tree.add(10);  // Attempt to insert duplicate
        assertNull(tree.root.left);  // No child added
        assertNull(tree.root.right); // No child added
    }
}
