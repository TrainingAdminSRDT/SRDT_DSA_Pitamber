from collections import deque

class MyStack:

    def __init__(self):
        self.q = deque()

    # Push element onto stack
    def push(self, x):
        self.q.append(x)

        # Move previous elements behind the new element
        for i in range(len(self.q) - 1):
            self.q.append(self.q.popleft())

    # Remove top element
    def pop(self):
        if self.empty():
            return "Stack is Empty"
        return self.q.popleft()

    # Get top element
    def top(self):
        if self.empty():
            return "Stack is Empty"
        return self.q[0]

    # Check if stack is empty
    def empty(self):
        return len(self.q) == 0


# Driver Code
stack = MyStack()

stack.push(10)
stack.push(20)
stack.push(30)

print("Top Element:", stack.top())
print("Popped:", stack.pop())
print("Top Element:", stack.top())