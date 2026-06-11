class CircularQueue:
    def __init__(self, size):
        self.size = size
        self.queue = [None] * size
        self.front = -1
        self.rear = -1

    # Check if queue is full
    def is_full(self):
        return (self.rear + 1) % self.size == self.front

    # Check if queue is empty
    def is_empty(self):
        return self.front == -1

    # Enqueue operation
    def enqueue(self, value):
        if self.is_full():
            print("Queue is Full!")
            return

        # first element
        if self.is_empty():
            self.front = 0

        self.rear = (self.rear + 1) % self.size
        self.queue[self.rear] = value
        print(f"Inserted {value}")

    # Dequeue operation
    def dequeue(self):
        if self.is_empty():
            print("Queue is Empty!")
            return

        removed = self.queue[self.front]

        # single element case
        if self.front == self.rear:
            self.front = self.rear = -1
        else:
            self.front = (self.front + 1) % self.size

        print(f"Removed {removed}")
        return removed

    # Peek front element
    def peek(self):
        if self.is_empty():
            return "Queue is Empty!"
        return self.queue[self.front]

    # Display queue
    def display(self):
        if self.is_empty():
            print("Queue is Empty!")
            return

        i = self.front
        print("Queue elements:", end=" ")

        while True:
            print(self.queue[i], end=" ")
            if i == self.rear:
                break
            i = (i + 1) % self.size
        print()


# ----------------- Example Usage -----------------
cq = CircularQueue(5)

cq.enqueue(10)
cq.enqueue(20)
cq.enqueue(30)
cq.enqueue(40)
cq.enqueue(50)

cq.display()

cq.dequeue()
cq.dequeue()

cq.display()

cq.enqueue(60)
cq.enqueue(70)

cq.display()

print("Front element:", cq.peek())