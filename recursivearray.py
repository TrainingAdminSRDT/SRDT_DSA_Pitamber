def array_sum(arr, n):
    if n == 0:
        return 0
    
    return arr[n-1] + array_sum(arr, n-1)


arr = [10, 20, 30, 40, 50]

print(array_sum(arr, len(arr)))