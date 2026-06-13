package SRDT_DSA_Pitamber;

import java.util.*;
class TreeNode{
    int data;
    TreeNode left, right;
    this.data= data;
    this.left=null;
    this.right=null;

}
public class TreeMaster{
    public static TreeNode buildSampleTree(){
        TreeNode root= new TreeNode(4);
        root.left=new TreeNode(2);
        root.right= new TreeNode(6);
        root.left.left=new TreeNode(1);
        root.left.right =new TreeNode(3);
        root.rigt.left=new TreeNode(5);
        root.right.right=new TreeNode(7);
        return root;
    }
    public static int height(TreeNode root){
        if (root==null) return 0;
        return 1+ Math.max(height(root.left), height(root.right));
        public static int size(TreeNode root){
            if(root==null ) return 0;
            return 1+ size(root.left) +(root.right));


        }

        public static void preorder(Treenode root)
        if(root ==null) return ;
        System.out.println(root.data+ "");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(TreeNode root){
        if (root==null) return ;
        inorder(root.left);
        System .out.println(root.data+ "");
        inorder(root.right);

    }
    public static void postorder(TreeNode){
        postorder( root.left);
        postorder(right.left);
        System.out.println(root.data + "");

    }
    public static void iterativePreoder(TreeNode root){
        if(root==null)return;
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        while(! stack.isempty()) {
            TreeNode curr=stack.pop();
            System.out.println(curr.data + "");
            if(curr.right!=null)stack.push(curr.right);
            if(curr.left!=null)stack.push(curr.left);

        }
    }
    public static void iterativeInorder(TreeNode root){
        Stack<TreeNode>stack=new Stack<>();
        TreeNode curr=root;
        while( curr!=null||!stack.isEmpty) {
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop()
            System.out.println(curr.data + "" );
            curr=curr.right;
        }
        
    }
    public static void iterativePostorder( TreeNode root){
        if(root==null) return;
        Stack<TreeNode>s1=newStack<>(),s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()) System.out.println(s2.pop().data+"");




    }  
    public static void levelOrder(TreeNode root){
        if(root==null)return;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            System.out.println("Level" +level+":");
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                System.out.println(curr.data +"");
                if(curr.left!= null)q.offer(curr.left);
                if(curr.right!= null)q.offer(curr.right);
                
            }

        }
    }


            
}