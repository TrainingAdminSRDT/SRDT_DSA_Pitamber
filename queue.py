# Queue using List

queue = []

# Enqueue Operation
queue.append(10)
queue.append(20)
queue.append(30)

print("Queue after insertion:", queue)

# Dequeue Operation
removed = queue.pop(0)
print("Deleted element:", removed)

# Front Element
print("Front element:", queue[0])

# Display Queue
print("Queue elements:", queue)