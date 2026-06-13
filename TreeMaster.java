import java.util.*;

class TreeNode{
    int data;
    TreeNode left,right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }
}

public class TreeMaster{

    public static TreeNode buildSampleTree(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        return root;
    }
    public static int height (TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int size(TreeNode root){
        if(root == null)return 0;
        return 1 + size(root.left) + size(root.right);

    }
    public static void preorder(TreeNode root){
        if(root == null)return;
        System.out.print(root.data + "");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(TreeNode root){
        if (root == null)return;
        System.out.print(root.data +"");
        inorder(root.right);

    }
    public static void postorder(TreeNode root){
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +""):
    }
    public static void iterativePreorder(TreeNode root){
        if (root == null)return:
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr  = stack.pop();
            System.out.print(curr.data + ""):
            if(curr.right != null) stack.push(curr.right):
            if(curr.right != null) stack.push(curr.left);

        }
    }
    public static void iterativeInorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr 1= null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr =stack.pop();
            System.out.print(curr.data +"");
            curr = curr.right;
        }

    }
    public static void iterativePostorder(TreeNode root){
        if(root == null)return;
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode curr = s1.pop();
            s2.push(curr);
            if(curr.left != null) s1.push(curr.left);
            if(curr.right != null) s1.push(curr.right);
        }
        while (!s2.isEmpty()) System.out.print(s2.pop().data + "");
    }
    public static void levelOrder(TreeNode root){
        if(root == null)return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            System.out.print("Level" + level+ ":");
            for( int i = 0 ; i < size;i++){
                TreeNode curr = q.poll();
                System.out.print(curr.data + "");
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }
            System.out.System.println();
            level++

        }
    }
    private static int maxDiam =0;
    public static int getDiameter(TreeNode root){
        maxDiam = 0;
        calculatwHeighgtForDiameter(root);
        return maxDiam;
    }
    private static int calculateHeightForDiameter(TreeNode root){
        if(root == null)return 0;
        int lh = calculateHeightForDiameter(root.left);
        int rh = calculateHeightForDiameter(root.right);
        maxDiam = Math.max(maxDiam);
        return 1 + Math.max(lh,rh);

    }
    public static boolean search (TreeNode root , int val){
        if(root == null) return false;
        if(root.data == val)return true;
        
        if(val < root.data) return search(root.left, val);
        else return search (root.right, val);
    }
    public static TreeNode insert(TreeNode root, int val){
        if(root == null) return new TreeNode (val);

        if(val < root.data) root.right = insert(root.left,val);
        else if(val > root.data)root.right = insert(root.right, val);
        return root;
    }
    public static TreeNode update(TreeNode root, int oldval, int newVal){
        if(search(root,oldVal)){
            root  = delete(root,oldVal);
            root = insert(root, newVal);
        }
        return root;
    }
    

}