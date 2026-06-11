class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def find_cycle_start(head):
    slow = head
    fast = head

    # Detect cycle
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            break
    else:
        return None  # No cycle

    # Find starting node of cycle
    slow = head

    while slow != fast:
        slow = slow.next
        fast = fast.next

    return slow


# Driver Code
head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)
head.next.next.next.next = Node(50)

# Create cycle: 50 -> 30
head.next.next.next.next.next = head.next.next

start_node = find_cycle_start(head)

if start_node:
    print("Cycle starts at node:", start_node.data)
else:
    print("No cycle found")