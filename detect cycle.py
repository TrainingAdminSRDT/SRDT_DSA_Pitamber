# Program to Detect Cycle in a Linked List

# Node Class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Function to detect cycle
def detect_cycle(head):
    slow = head
    fast = head

    while fast and fast.next:
        slow = slow.next          # Move 1 step
        fast = fast.next.next     # Move 2 steps

        if slow == fast:
            return True

    return False

# Create Linked List
head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)

# Create Cycle (40 -> 20)
head.next.next.next.next = head.next

# Check Cycle
if detect_cycle(head):
    print("Cycle Detected")
else:
    print("No Cycle")