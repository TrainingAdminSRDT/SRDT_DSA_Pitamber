public class Stack_Queue{
    private int[] arr;
    private int front,rear,size;
    public Stack_Queue(int capacity){
        arr=new int[capacity];
        front =0;
        rear=-1;
        size=0

    }
    public boolean isEmpty(){ return size==0;}
    public boolean isFull(){ return size == arr.length;}
    public void enqueue (int x)
    if(isFull()){
        system.out.println("queue overflow");
        return;
    }
    rear++;
    arr[rear]=x;
    size++;
} 
public int dequeue(){
    if(isEmpty()){
        system.out.println("queue underflow");
        return -1;


    }
    int val =arr[front];
    front++;
    size--;
    return val;

}
public int peak(){
    if (isEmpty()){
        system.out.println("queue is empty");
        return -1;
    }
    return arr[front];

} public static void main(String[]arg){
    Stack_Queue q= new Stack_Queue(3);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    System.out.println(q.dequeue());
    System.out.println(q.peek());
    q.enqueue(40);
    System.out.println(q.dequeue());
    System.out.println(q.peek())


}