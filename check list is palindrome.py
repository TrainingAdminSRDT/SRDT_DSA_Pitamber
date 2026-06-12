# Program to Check Whether a Linked List is Palindrome

# Node Class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Function to check palindrome
def is_palindrome(head):
    arr = []

    temp = head
    while temp:
        arr.append(temp.data)
        temp = temp.next

    return arr == arr[::-1]

# Create Linked List from User Input
n = int(input("Enter number of nodes: "))

head = None
tail = None

for i in range(n):
    data = int(input("Enter data: "))
    new_node = Node(data)

    if head is None:
        head = tail = new_node
    else:
        tail.next = new_node
        tail = new_node

# Check Palindrome
if is_palindrome(head):
    print("Palindrome Linked List")
else:
    print("Not a Palindrome Linked List")