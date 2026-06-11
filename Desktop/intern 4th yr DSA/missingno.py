#Find missing number in 1 2 array
def missing_number(arr, n):
    return n * (n + 1) // 2 - sum(arr)