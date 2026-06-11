class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def detect_cycle(head):
    slow = head
    fast = head

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            return True

    return False


# Driver Code
head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)

# Create a cycle
head.next.next.next.next = head.next

if detect_cycle(head):
    print("Cycle Detected")
else:
    print("No Cycle")