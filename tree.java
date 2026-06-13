
class Tree {
    int val;
    Tree left;
    Tree right;

    Tree(int data) {
        this.val = data;
        this.left = null;
        this.right = null;
    }
}

public class tree {

    static void print(Tree root) {
        if (root == null) return;

        print(root.left);
        System.out.print(root.val + " ");
        print(root.right);
    }

    public static void main(String[] args) {

        // Creating tree
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);

 
        System.out.print("Tree (Inorder): ");
        print(root);
    }
    public static int height(Tree root) {
        if (root == null) return 0;

      return 1 + Math.max(height(root.left), height(root.right));
    
    }
    public static int size(Tree root) {
        if (root == null) return 0;

        return 1 + size(root.left) + size(root.right);
    }
//3.1 iterative preorder
    public static void printIterative(Tree root) {
        if (root == null) return;

        Stack<Tree> stack = new Stack<>();
        Tree current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
}
//iterative inorder
    public static void printIterativeInorder(Tree root) {
        if (root == null) return;

        Stack<Tree> stack = new Stack<>();
        Tree current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
    //iterative postorder
    public static void printIterativePostorder(Tree root) { 
        if (root == null) return;

        Stack<Tree> stack = new Stack<>();
        Tree current = root;
        Tree lastVisited = null;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            Tree peekNode = stack.peek();
            if (peekNode.right != null && lastVisited != peekNode.right) {
                current = peekNode.right;
            } else {
                System.out.print(peekNode.val + " ");
                lastVisited = stack.pop();
            }
        }
    }