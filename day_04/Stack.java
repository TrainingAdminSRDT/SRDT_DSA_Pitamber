
//  implement stack using array 
public class Stack {
    private int[] arr;
    private int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop()); // 30
        System.out.println("Top: " + s.peek()); // 20
    }
}
