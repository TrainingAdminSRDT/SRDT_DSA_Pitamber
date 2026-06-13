# def array_sum(arr, n):
#     # Base case
#     if n == 0:
#         return 0

#     # Recursive case
#     return arr[n - 1] + array_sum(arr, n - 1)

# arr = [1, 2, 3, 4, 5]
# print("Sum =", array_sum(arr, len(arr)))


#linearsearch using recursion
# def linear_search(arr, n, key):
#     # Base case
#     if n == 0:
#         return -1

#     # Check last element
#     if arr[n - 1] == key:
#         return n - 1

#     # Recursive call
#     return linear_search(arr, n - 1, key)

# arr = [10, 20, 30, 40, 50]
# key = 30

# result = linear_search(arr, len(arr), key)

# if result != -1:
#     print("Element found at index", result)
# else:
#     print("Element not found")



#reverse the string recursively
# def reverse_string(s):
#     # Base case
#     if len(s) == 0:
#         return s

#     # Recursive case
#     return reverse_string(s[1:]) + s[0]

# string = "HELLO"
# print(reverse_string(string))


#to check pallindrome recursively
# def reverse_num(n, rev=0):
#     if n == 0:
#         return rev

#     return reverse_num(n // 10, rev * 10 + n % 10)

# num = 121

# if num == reverse_num(num):
#     print("Palindrome")
# else:
    # print("Not Palindrome")


#from linear search find element in index
# def linear_search(arr, key):
#     for i in range(len(arr)):
#         if arr[i] == key:
#             return i   # returns index of element
#     return -1          # element not found

# arr = [10, 20, 30, 40, 50]
# key = 40

# result = linear_search(arr, key)

# if result != -1:
#     print("Element found at index:", result)
# else:
#     print("Element not found")
  
  #merge sort 
def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2

    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    return merge(left, right)


def merge(left, right):
    result = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])

    return result


arr = [38, 27, 43, 3, 9, 82, 10]
print(merge_sort(arr))