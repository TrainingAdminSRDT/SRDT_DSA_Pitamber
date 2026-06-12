public class circular_queue {
    int[] queue;
    int front,rear,size;
    public circular_queue(int c){
        size=c;
        queue=new int [size];
        front=-1;
        rear=-1;
    }
    public void eneque(int data){
        if((rear+1))% size == front){
            System.out.println("Queue is full");
            return;
        }
        if (front == -1){
            front = 0;
        }
        rear = (rear+1)% size;
        queue[rear] = data;

    }
    public void display(){
        if(front == -1){
            System.out.print("Queue is empty");
            return;

        }
        int i = front;
        while(true){
            System.out.print(queue[i]+"");
            if(i == rear){
                break;
            }
            i = (i+1)% size;

        }
        System.out.println();
    }

    public static void main(String[] args){
        
        circular_queue cq = new circular_queue(3);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();

        cq.enqueue(40); 
        cq.display();   
        cq.enqueue(40); 
        cq.display(); 
    }  
}