# # to find element in index
# def linear_search(arr, target):

#     for i in range(len(arr)):

#         if arr[i] == target:
#             return i

#     return -1


# arr = [10, 20, 30, 40, 50]

# target = 30

# result = linear_search(arr, target)


# if result != -1:
#     print("Element found at index:", result)

# else:
#     print("Element not found")

# #---------------------------------------------------------------------------------------------------------------


# # first and last occurrence in sorted array
# def first_occurrence(arr, target):

#     start = 0
#     end = len(arr) - 1
#     ans = -1

#     while start <= end:

#         mid = start + (end - start) // 2

#         if arr[mid] == target:
#             ans = mid
#             end = mid - 1

#         elif target < arr[mid]:
#             end = mid - 1

#         else:
#             start = mid + 1

#     return ans


# #___________________________________________________________________________________________________________


# # Function to find last occurrence
# def last_occurrence(arr, target):

#     start = 0
#     end = len(arr) - 1
#     ans = -1

#     while start <= end:

#         mid = start + (end - start) // 2

#         if arr[mid] == target:
#             ans = mid
#             start = mid + 1

#         elif target < arr[mid]:
#             end = mid - 1

#         else:
#             start = mid + 1

#     return ans



# #_____________________________________________________________________________________________________________



#  # First Occurrence & Last Occurrence (Binary Search)
# arr = [1, 2, 2, 2, 3, 4, 5]

# target = 2

# first = first_occurrence(arr, target)
# last = last_occurrence(arr, target)

# print("First occurrence:", first)
# print("Last occurrence:", last)


# def merge(arr, left, mid, right):

#     left_arr = arr[left: mid + 1]
#     right_arr = arr[mid + 1:right + 1]

#     i = 0
#     j = 0
#     k = left

#     while i < len(left_arr) and j < len(right_arr):

#         if left_arr[i] <= right_arr[j]:
#             arr[k] = left_arr[i]
#             i += 1

#         else:
#             arr[k] = right_arr[j]
#             j += 1

#         k += 1


#     while i < len(left_arr):

#         arr[k] = left_arr[i]
#         i += 1
#         k += 1


#     while j < len(right_arr):

#         arr[k] = right_arr[j]
#         j += 1
#         k += 1


# #--------------------------------------------------------------------------------------------------------------


#  # Function for merge sort implementation
# def merge_sort(arr, left, right):

#     if left < right:

#         mid = left + (right - left) // 2

#         merge_sort(arr, left, mid)

#         merge_sort(arr, mid + 1, right)

#         merge(arr, left, mid, right)



# arr = [38, 27, 43, 3, 9, 82, 10]

# print("Before sorting:", arr)

# merge_sort(arr, 0, len(arr) - 1)

# print("After sorting:", arr)


# #--------------------------------------------------------------------------------------------------------------


# # rotated and sorted array
# def search(nums, target):

#     start = 0
#     end = len(nums) - 1

#     while start <= end:

#         mid = start + (end - start) // 2

#         if nums[mid] == target:
#             return mid

#         if nums[start] <= nums[mid]:

#             if nums[start] <= target < nums[mid]:
#                 end = mid - 1

#             else:
#                 start = mid + 1

#         else:

#             if nums[mid] < target <= nums[end]:
#                 start = mid + 1

#             else:
#                 end = mid - 1

#     return -1



# nums = [4, 5, 6, 7, 0, 1, 2]

# target = 0

# result = search(nums, target)

# print("Index:", result)



# #--------------------------------------------------------------------------------------------------------------



# # missing number in array
# def find_missing(arr):

#     n = len(arr) + 1

#     total_sum = n * (n + 1) // 2

#     arr_sum = 0

#     for i in arr:
#         arr_sum += i

#     missing = total_sum - arr_sum

#     return missing



# arr = [1, 2, 4, 5, 6]

# result = find_missing(arr)

# print("Missing number:", result)



# #--------------------------------------------------------------------------------------------------------------


# # to check sorted array
# def check(nums):

#     count = 0

#     n = len(nums)

#     for i in range(n):

#         if nums[i] > nums[(i + 1) % n]:

#             count += 1


#     if count <= 1:
#         return True

#     else:
#         return False



# arr = [3, 4, 5, 1, 2]

# result = check(arr)

# print(result)


