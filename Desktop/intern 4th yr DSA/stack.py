stack = []

stack.append(10)
stack.append(20)
stack.append(30)

print("Stack:", stack)

item = stack.pop()
print("Popped:", item)

print("Top element:", stack[-1])

print("Stack after pop:", stack)