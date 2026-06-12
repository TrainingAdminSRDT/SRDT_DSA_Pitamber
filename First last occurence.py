def first_occurrence(arr, target):
    low, high = 0, len(arr) - 1
    ans = -1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == target:
            ans = mid
            high = mid - 1  # search left side
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

    return ans
def last_occurrence(arr, target):
    low, high = 0, len(arr) - 1
    ans = -1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == target:
            ans = mid
            low = mid + 1   # search right side
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

    return ans
arr = [1, 2, 2, 2, 3, 4, 5]
target = 2

print("First Occurrence:", first_occurrence(arr, target))
print("Last Occurrence:", last_occurrence(arr, target))