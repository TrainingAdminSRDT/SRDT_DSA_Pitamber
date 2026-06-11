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

    # Insert at end
    def insert_end(self, data):
        new_node = Node(data)

        # If list is empty
        if self.head is None:
            self.head = new_node
            return

        temp = self.head
        while temp.next:
            temp = temp.next

        temp.next = new_node
        new_node.prev = temp

    # Display forward
    def display_forward(self):
        temp = self.head
        while temp:
            print(temp.data, end=" <-> ")
            temp = temp.next
        print("None")

    # Display backward
    def display_backward(self):
        temp = self.head

        if temp is None:
            return

        while temp.next:
            temp = temp.next

        while temp:
            print(temp.data, end=" <-> ")
            temp = temp.prev
        print("None")


# Driver Code
dll = DoublyLinkedList()

dll.insert_end(10)
dll.insert_end(20)
dll.insert_end(30)
dll.insert_end(40)

print("Forward Traversal:")
dll.display_forward()

print("Backward Traversal:")
dll.display_backward()