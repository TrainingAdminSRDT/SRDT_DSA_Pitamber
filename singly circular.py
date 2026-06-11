# Node class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


# Singly Circular Linked List
class CircularLinkedList:
    def __init__(self):
        self.head = None

    # Insert at end
    def insert_end(self, data):
        new_node = Node(data)

        # If list is empty
        if self.head is None:
            self.head = new_node
            new_node.next = self.head
            return

        temp = self.head
        while temp.next != self.head:
            temp = temp.next

        temp.next = new_node
        new_node.next = self.head

    # Display the list
    def display(self):
        if self.head is None:
            print("List is empty")
            return

        temp = self.head
        while True:
            print(temp.data, end=" -> ")
            temp = temp.next

            if temp == self.head:
                break

        print("(head)")


# Driver Code
cll = CircularLinkedList()

cll.insert_end(10)
cll.insert_end(20)
cll.insert_end(30)
cll.insert_end(40)

print("Singly Circular Linked List:")
cll.display()