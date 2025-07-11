public class bst_tree_108 {

    int val;
    bst_tree_108 left;
    bst_tree_108 right;

    // Constructors
    bst_tree_108() {}

    bst_tree_108(int val) {
        this.val = val;
    }

    bst_tree_108(bst_tree_108 left, bst_tree_108 right, int val) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Helper method to print the tree (Pre-order traversal)
    public void printTree() {
        System.out.print(this.val + " ");
        if (this.left != null) this.left.printTree();
        if (this.right != null) this.right.printTree();
    }

    // Main method to manually create a tree
    public static void main(String[] args) {
        // Manually create tree nodes
        bst_tree_108 leftChild = new bst_tree_108(1);
        bst_tree_108 rightChild = new bst_tree_108(3);
        bst_tree_108 root = new bst_tree_108(leftChild, rightChild, 2);

        // Optionally add more children
        root.left.left = new bst_tree_108(0);
        root.right.right = new bst_tree_108(4);

        // Print the tree
        root.printTree();  // Output: 2 1 0 3 4
    }
}
