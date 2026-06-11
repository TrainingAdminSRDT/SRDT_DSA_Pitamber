# Node class
class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None


# Doubly Linked List class
class DoublyLinkedList:
    def __init__(self):
        self.head = None

    # Insert at beginning
    def insert_beginning(self, data):
        new_node = Node(data)

        if self.head is not None:
            self.head.prev = new_node
            new_node.next = self.head

        self.head = new_node

    # Insert at end
    def insert_end(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return

        temp = self.head
        while temp.next:
            temp = temp.next

        temp.next = new_node
        new_node.prev = temp

    # Display list
    def display(self):
        temp = self.head

        while temp:
            print(temp.data, end=" <-> ")
            temp = temp.next

        print("None")


# Driver Code
dll = DoublyLinkedList()

dll.insert_beginning(20)
dll.insert_beginning(10)

dll.insert_end(30)
dll.insert_end(40)

print("Doubly Linked List:")
dll.display()