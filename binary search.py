def binary_search(arr, target):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

    return -1

# User input
n = int(input("Enter number of elements: "))

arr = []
print("Enter sorted elements:")
for i in range(n):
    arr.append(int(input()))

target = int(input("Enter element to search: "))

result = binary_search(arr, target)

if result != -1:
    print("Element found at index", result)
else:
    print("Element not found")