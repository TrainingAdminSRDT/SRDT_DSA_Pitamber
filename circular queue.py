# Circular Queue Implementation

class CircularQueue:
    def __init__(self, size):
        self.size = size
        self.queue = [None] * size
        self.front = -1
        self.rear = -1

    # Insert element
    def enqueue(self, data):
        if (self.rear + 1) % self.size == self.front:
            print("Queue is Full")
            return

        if self.front == -1:  # First element
            self.front = 0
            self.rear = 0
        else:
            self.rear = (self.rear + 1) % self.size

        self.queue[self.rear] = data
        print(data, "inserted")

    # Delete element
    def dequeue(self):
        if self.front == -1:
            print("Queue is Empty")
            return

        removed = self.queue[self.front]

        if self.front == self.rear:  # Only one element
            self.front = -1
            self.rear = -1
        else:
            self.front = (self.front + 1) % self.size

        print(removed, "deleted")

    # Display queue
    def display(self):
        if self.front == -1:
            print("Queue is Empty")
            return

        print("Queue elements:", end=" ")

        i = self.front
        while True:
            print(self.queue[i], end=" ")
            if i == self.rear:
                break
            i = (i + 1) % self.size
        print()


# Driver Code
q = CircularQueue(5)

q.enqueue(10)
q.enqueue(20)
q.enqueue(30)
q.enqueue(40)

q.display()

q.dequeue()
q.dequeue()

q.display()

q.enqueue(50)
q.enqueue(60)

q.display()