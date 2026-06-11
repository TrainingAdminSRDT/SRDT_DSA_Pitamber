# Stack Program with User Input

stack = []

# User se stack ka size lena
size = int(input("Enter size of stack: "))

# Push operation
for i in range(size):
    element = int(input("Enter element: "))
    stack.append(element)

# Display stack
print("\nStack elements are:", stack)

# Peek operation
if len(stack) > 0:
    print("Top element is:", stack[-1])

# Pop operation
if len(stack) > 0:
    removed = stack.pop()
    print("Popped element is:", removed)

# Display stack after pop
print("Stack after pop:", stack)

# Check if stack is empty
if len(stack) == 0:
    print("Stack is Empty")
else:
    print("Stack is Not Empty")

# Size of stack
print("Current size of stack:", len(stack))