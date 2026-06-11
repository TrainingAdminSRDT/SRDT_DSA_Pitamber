size = int(input("Enter size: "))
q = [None] * size
front = -1
rear = -1

while True:
    print("\n1.Insert")
    print("2.Delete")
    print("3.Display")
    print("4.Exit")

    ch = int(input("Enter choice: "))

    if ch == 1:
        x = int(input("Enter element: "))

        if (rear + 1) % size == front:
            print("Overflow")
        else:
            if front == -1:
                front = rear = 0
            else:
                rear = (rear + 1) % size

            q[rear] = x

    elif ch == 2:
        if front == -1:
            print("Underflow")
        else:
            print("Deleted:", q[front])

            if front == rear:
                front = rear = -1
            else:
                front = (front + 1) % size

    elif ch == 3:
        if front == -1:
            print("Queue is empty")
        else:
            i = front

            while True:
                print(q[i], end=" ")
                if i == rear:
                    break
                i = (i + 1) % size

            print()

    elif ch == 4:
        break

    else:
        print("Invalid choice")