public class Stack {

   
        private int arr[];
        private int top;
    
     public  Stack(int capacity){
         arr = new int[capacity];
         top = -1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==arr.length-1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = arr[top];
            top--;
            return x;
        }
    }

    public int peek(){
        return arr[top];
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
      System.out.println("Top element is: " + stack.peek());
    }
}
