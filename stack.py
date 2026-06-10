class Stack:
    def __init__(x):
        x.stack = []

    def push(x, item):
        x.stack.append(item)

    def pop(x):
        if not x.is_empty():
            return x.stack.pop()
        return "Stack Underflow"

    def peek(x):
        if not x.is_empty():
            return x.stack[-1]
        return None

    def is_empty(x):
        return len(x.stack) == 0

s = Stack()

s.push(10)
s.push(20)
s.push(30)

print("Top:", s.peek())
print("Removed:", s.pop())
print("Top after pop:", s.peek())