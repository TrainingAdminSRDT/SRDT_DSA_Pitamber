from collections import deque

# Create deque
dq = deque()

# Insert at rear
dq.append(10)
dq.append(20)

# Insert at front
dq.appendleft(5)

print("Deque:", dq)

# Delete from rear
dq.pop()

# Delete from front
dq.popleft()

print("After deletion:", dq)