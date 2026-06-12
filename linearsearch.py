def linear_search(arr, target, index):
    if index == len(arr):
        return -1
    
    if arr[index] == target:
        return index
    
    return linear_search(arr, target, index + 1)


arr = [10, 20, 30, 40, 50]

target = int(input("Enter element to search: "))

result = linear_search(arr, target, 0)

if result == -1:
    print("Element not found")
else:
    print("Element found at index", result)