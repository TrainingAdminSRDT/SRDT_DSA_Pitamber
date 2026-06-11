class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def insert_end(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return

        temp = self.head
        while temp.next:
            temp = temp.next

        temp.next = new_node

    def find_middle(self):
        if self.head is None:
            print("List is empty")
            return

        slow = self.head
        fast = self.head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        print("Middle element:", slow.data)


# Driver Code
ll = LinkedList()

ll.insert_end(10)
ll.insert_end(20)
ll.insert_end(30)
ll.insert_end(40)
ll.insert_end(50)

ll.find_middle()