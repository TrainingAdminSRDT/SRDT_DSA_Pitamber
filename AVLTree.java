import java.util.*;

class Node{
    int data;
    Node left,right;
    int height;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
    //Function to get height of tree:
    static int height(Node n){
        if(n == null){
            return 0;
            return n.height;
        }
    }
    //Function to right rotated
    static void rightRotated(Node y){
        Node x = y.left;
        Node T2 = x.right;
        
        x.right = y; //Perform right rotation
        y.left = T2;

        y.height = 1+ Math.max(height(y.left),height(y.right));
        x.height = 1+ Math.max(height(height(x.left),height(x.right)));
        //Return root
        return x;
    } 
    function to left rotate 
    // subtree rooted with x 
    static Node leftRotate(Node x) { 
        Node y = x.right; 
        Node T2 = y.left; 

        // Perform rotation 
        y.left = x; 
        x.right = T2; 

        // Update heights 
        x.height = 1 + Math.max(height(x.left),height(x.right)); 
        y.height = 1 + Math.max(height(y.left), height(y.right)); 

        // Return new root 
        return y; 
    } 

    class TreeNode{
        public static void main(String args[]){
            Node firstNode = new Node(2);
            Node secondNode = new Node(3);
            Node thirdNode = new Node(4);
            Node forthNode = new Node(5);

            firstNode.left = secondNode;
            firstNode.right = thirdNode;
            secondNode.left = forthNode;
        }

    }
}
