class BinaryTree {

    // Node class
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    BinaryTree() {
        root = null;
    }

    // Insert in level order
    void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node[] queue = new Node[100];
        int front = 0, rear = 0;

        queue[rear++] = root;

        while (front < rear) {
            Node temp = queue[front++];

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                queue[rear++] = temp.left;
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue[rear++] = temp.right;
            }
        }
    }

    // Inorder Traversal
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Preorder Traversal
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Postorder Traversal
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(40);
        bt.insert(50);
        bt.insert(60);
        bt.insert(70);

        System.out.print("Inorder: ");
        bt.inorder(bt.root);

        System.out.println();

        System.out.print("Preorder: ");
        bt.preorder(bt.root);

        System.out.println();

        System.out.print("Postorder: ");
        bt.postorder(bt.root);

        System.out.println();
    }
}
