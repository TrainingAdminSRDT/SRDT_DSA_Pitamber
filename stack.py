# Create an empty stack
stack = []

# Take number of elements from user
n = int(input("Enter number of elements to push: "))

# Push elements into stack
for i in range(n):
    element = int(input("Enter element: "))
    stack.append(element)

# Display stack
print("Stack:", stack)

# Peek operation
if len(stack) > 0:
    print("Top element:", stack[-1])
else:
    print("Stack is empty")

# Pop operation
if len(stack) > 0:
    popped = stack.pop()
    print("Popped element:", popped)
else:
    print("Stack Underflow")

# Display stack after pop
print("Stack after pop:", stack)

# Check if stack is empty
if len(stack) == 0:
    print("Stack is empty")
else:
    print("Stack is not empty")

# Display size of stack
print("Size of stack:", len(stack))