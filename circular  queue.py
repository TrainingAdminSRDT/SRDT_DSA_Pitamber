class CircularQueue:
    def __init__(self, size):
        self.size = size
        self.queue = [0] * size
        self.front = -1
        self.rear = -1

    def enqueue(self, item):
        if (self.rear + 1) % self.size == self.front:
            print("Queue Overflow")
            return

        if self.front == -1:
            self.front = 0
            self.rear = 0
        else:
            self.rear = (self.rear + 1) % self.size

        self.queue[self.rear] = item
        print(item, "inserted")

    def dequeue(self):
        if self.front == -1:
            print("Queue Underflow")
            return

        item = self.queue[self.front]
        print(item, "deleted")

        if self.front == self.rear:
            self.front = -1
            self.rear = -1
        else:
            self.front = (self.front + 1) % self.size

    def display(self):
        if self.front == -1:
            print("Queue is Empty")
            return

        print("Queue Elements: ", end="")
        i = self.front

        while True:
            print(self.queue[i], end=" ")
            if i == self.rear:
                break
            i = (i + 1) % self.size
        print()


# User Input
size = int(input("Enter size of Circular Queue: "))
cq = CircularQueue(size)

while True:
    print("\n1. Enqueue")
    print("2. Dequeue")
    print("3. Display")
    print("4. Exit")

    choice = int(input("Enter your choice: "))

    if choice == 1:
        value = int(input("Enter element to insert: "))
        cq.enqueue(value)

    elif choice == 2:
        cq.dequeue()

    elif choice == 3:
        cq.display()

    elif choice == 4:
        print("Program Ended")
        break

    else:
        print("Invalid Choice!")