class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def is_palindrome(head):
    # Store elements in a list
    arr = []

    temp = head
    while temp:
        arr.append(temp.data)
        temp = temp.next

    # Check palindrome
    return arr == arr[::-1]


# Driver Code
head = Node(1)
head.next = Node(2)
head.next.next = Node(3)
head.next.next.next = Node(2)
head.next.next.next.next = Node(1)

if is_palindrome(head):
    print("Palindrome")
else:
    print("Not Palindrome")