class TernaryNode {
    int data;
    TernaryNode left;
    TernaryNode middle;
    TernaryNode right;

    TernaryNode(int data) {
        this.data = data;
    }
}

public class TernaryTree {
    public static void main(String[] args) {
        TernaryNode root = new TernaryNode(1);

        root.left = new TernaryNode(2);
        root.middle = new TernaryNode(3);
        root.right = new TernaryNode(4);

        System.out.println("Root: " + root.data);
    }
}