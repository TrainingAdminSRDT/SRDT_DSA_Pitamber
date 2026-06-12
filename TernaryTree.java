class TernaryNode {
    int data;
    TernaryNode left;
    TernaryNode middle;
    TernaryNode right;

    public TernaryNode(int data) {
        this.data = data;
        this.left = null;
        this.middle = null;
        this.right = null;
    }
}

public class TernaryTree {
    TernaryNode root;

    public TernaryTree(int rootValue) {
        root = new TernaryNode(rootValue);
    }

    public static void main(String[] args) {
        TernaryTree tree = new TernaryTree(1);

        tree.root.left = new TernaryNode(2);
        tree.root.middle = new TernaryNode(3);
        tree.root.right = new TernaryNode(4);

        tree.root.left.left = new TernaryNode(5);
        tree.root.left.middle = new TernaryNode(6);
        tree.root.left.right = new TernaryNode(7);

        System.out.println("Tree created successfully.");
    }
}