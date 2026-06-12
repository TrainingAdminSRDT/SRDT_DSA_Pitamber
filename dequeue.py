class Deque:
    def __init__(self, size):
        self.size = size
        self.arr = [None] * size
        self.front = -1
        self.rear = -1


    # Insert at front
    def insertFront(self, data):

        if (self.front == 0 and self.rear == self.size-1):
            print("Deque Overflow")
            return

        # first element
        if self.front == -1:
            self.front = self.rear = 0

        # shift front left
        elif self.front > 0:
            self.front -= 1

        else:
            print("Cannot insert at front")
            return

        self.arr[self.front] = data


    # Insert at rear
    def insertRear(self, data):

        if self.rear == self.size-1:
            print("Deque Overflow")
            return

        if self.front == -1:
            self.front = self.rear = 0

        else:
            self.rear += 1

        self.arr[self.rear] = data


    # Delete from front
    def deleteFront(self):

        if self.front == -1:
            print("Deque Underflow")
            return

        value = self.arr[self.front]
        self.arr[self.front] = None

        if self.front == self.rear:
            self.front = self.rear = -1
        else:
            self.front += 1

        return value


    # Delete from rear
    def deleteRear(self):

        if self.rear == -1:
            print("Deque Underflow")
            return

        value = self.arr[self.rear]
        self.arr[self.rear] = None

        if self.front == self.rear:
            self.front = self.rear = -1
        else:
            self.rear -= 1

        return value


    # Display deque
    def display(self):

        if self.front == -1:
            print("Deque is empty")
            return

        for i in range(self.front, self.rear+1):
            print(self.arr[i], end=" ")
        print()


# Driver code

dq = Deque(5)

dq.insertRear(10)
dq.insertRear(20)
dq.insertFront(5)

dq.display()

print("Deleted Front:", dq.deleteFront())
print("Deleted Rear:", dq.deleteRear())

dq.display()