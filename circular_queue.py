"""Circular queue implementation with a professional Python interface."""

from __future__ import annotations

class CircularQueue:
    """Fixed-size circular queue with enqueue and dequeue operations."""

    def __init__(self, capacity: int) -> None:
        if capacity < 1:
            raise ValueError("Capacity must be at least 1")

        self._capacity = capacity
        self._items = [None] * capacity
        self._head = 0
        self._tail = 0
        self._count = 0

    def is_empty(self) -> bool:
        """Return True if the queue has no elements."""
        return self._count == 0

    def is_full(self) -> bool:
        """Return True if the queue cannot accept more elements."""
        return self._count == self._capacity

    def enqueue(self, value) -> None:
        """Add a value to the rear of the queue.

        Raises:
            OverflowError: If the queue is already full.
        """
        if self.is_full():
            raise OverflowError("Queue is full")

        self._items[self._tail] = value
        self._tail = (self._tail + 1) % self._capacity
        self._count += 1

    def dequeue(self):
        """Remove and return the value at the front of the queue.

        Raises:
            IndexError: If the queue is empty.
        """
        if self.is_empty():
            raise IndexError("Queue is empty")

        value = self._items[self._head]
        self._items[self._head] = None
        self._head = (self._head + 1) % self._capacity
        self._count -= 1
        return value

    def peek(self):
        """Return the value at the front without removing it."""
        if self.is_empty():
            raise IndexError("Queue is empty")
        return self._items[self._head]

    def to_list(self) -> list:
        """Return a list representation of the queue contents."""
        result = []
        for index in range(self._count):
            position = (self._head + index) % self._capacity
            result.append(self._items[position])
        return result

    def __repr__(self) -> str:
        return f"CircularQueue({self.to_list()})"


def main() -> None:
    queue = CircularQueue(5)
    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)
    queue.enqueue(40)

    print("Initial queue:", queue)

    print("Dequeued:", queue.dequeue())
    print("Dequeued:", queue.dequeue())

    print("Queue after removals:", queue)

    queue.enqueue(50)
    queue.enqueue(60)

    print("Final queue:", queue)
    print("Contents:", queue.to_list())


if __name__ == "__main__":
    main()
