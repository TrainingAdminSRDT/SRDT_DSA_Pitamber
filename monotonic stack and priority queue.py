# Priority Queue using List

class PriorityQueue:

    # Constructor
    def __init__(self):
        self.queue = []

    # Insert element with priority
    def enqueue(self, item, priority):
        self.queue.append((priority, item))

    # Remove highest priority element
    def dequeue(self):
        if len(self.queue) == 0:
            print("Queue is Empty")
            return

        # Find element with highest priority
        highest = min(self.queue)

        # Remove that element
        self.queue.remove(highest)

        print("Removed Item:", highest[1])

    # Display queue
    def display(self):
        print("\nCurrent Queue:")
        for priority, item in self.queue:
            print("Item:", item, "Priority:", priority)


# Create Priority Queue object
pq = PriorityQueue()

# Take number of elements from user
n = int(input("Enter number of elements: "))

# Input elements and priorities
for i in range(n):
    item = input("Enter item: ")
    priority = int(input("Enter priority: "))
    pq.enqueue(item, priority)

# Display queue
pq.display()

# Remove highest priority element
pq.dequeue()

# Display queue after deletion
pq.display()