# # def linear_search(arr, target, index):
# #     if index == len(arr):
# #         return -1
    
# #     if arr[index] == target:
# #         return index
    
# #     return linear_search(arr, target, index + 1)


# # arr = [10, 20, 30, 40, 50]

# # target = int(input("Enter element to search: "))

# # result = linear_search(arr, target, 0)

# # if result == -1:
# #     print("Element not found")
# # else:
# #     print("Element found at index", result)




# def reverse_string(s):
#     if len(s) == 0:          # Base case
#         return ""
    
#     return reverse_string(s[1:]) + s[0]   # Recursive case


# s = input("Enter string: ")

# print("Reverse =", reverse_string(s))





def is_palindrome(s, start, end):
    if start >= end:          # Base case
        return True
    
    if s[start] != s[end]:
        return False
    
    return is_palindrome(s, start + 1, end - 1)   # Recursive case


s = input("Enter string: ")

if is_palindrome(s, 0, len(s)-1):
    print("Palindrome")
else:
    print("Not Palindrome")