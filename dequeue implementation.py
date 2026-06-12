# Manual implementation of Deque using List

class Deque:
    def __init__(self):
        self.items = []

    # Insert at front
    def insert_front(self, data):
        self.items.insert(0, data)

    # Insert at rear
    def insert_rear(self, data):
        self.items.append(data)

    # Delete from front
    def delete_front(self):
        if self.is_empty():
            print("Deque is Empty")
        else:
            print("Deleted from front:", self.items.pop(0))

    # Delete from rear
    def delete_rear(self):
        if self.is_empty():
            print("Deque is Empty")
        else:
            print("Deleted from rear:", self.items.pop())

    # Display deque
    def display(self):
        if self.is_empty():
            print("Deque is Empty")
        else:
            print("Deque:", self.items)

    # Check empty
    def is_empty(self):
        return len(self.items) == 0


# Driver Code
dq = Deque()

while True:
    print("\n1. Insert Front")
    print("2. Insert Rear")
    print("3. Delete Front")
    print("4. Delete Rear")
    print("5. Display")
    print("6. Exit")

    choice = int(input("Enter choice: "))

    if choice == 1:
        data = int(input("Enter value: "))
        dq.insert_front(data)

    elif choice == 2:
        data = int(input("Enter value: "))
        dq.insert_rear(data)

    elif choice == 3:
        dq.delete_front()

    elif choice == 4:
        dq.delete_rear()

    elif choice == 5:
        dq.display()

    elif choice == 6:
        print("Program Ended")
        break

    else:
        print("Invalid Choice")