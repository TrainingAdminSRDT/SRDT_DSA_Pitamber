#First and last occurrence in sorted array with duplicates
def first_last(arr, x):
    first = last = -1

    for i in range(len(arr)):
        if arr[i] == x:
            if first == -1:
                first = i
            last = i

    return first, last