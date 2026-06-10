# # to find elememnt in index

# # Function for Linear Search
# def linear_search(arr, target):

#     # Traverse every element of the array using index
#     for i in range(len(arr)):

#         # Check if current element is equal to target element
#         if arr[i] == target:

#             # If element is found, return its index
#             return i

#     # If loop finishes and element is not found
#     return -1


# # Creating an array/list
# arr = [10, 20, 30, 40, 50]

# # Element that we want to search
# target = 30


# # Calling linear_search function
# result = linear_search(arr, target)


# # Checking the returned value
# if result != -1:

#     # Element found, print its index
#     print("Element found at index:", result)

# else:

#     # Element not found
#     print("Element not found")


# #---------------------------------------------------------------------------------------------------------------


# #first and last occurrence in sorted array
# # Function to find first occurrence
# def first_occurrence(arr, target):

#     # Starting index
#     start = 0

#     # Ending index
#     end = len(arr) - 1

#     # Store answer
#     ans = -1

#     # Binary search loop
#     while start <= end:

#         # Find middle index
#         mid = start + (end - start) // 2

#         # If target found
#         if arr[mid] == target:

#             # Store current index as answer
#             ans = mid

#             # Move left to find first occurrence
#             end = mid - 1

#         # If target is smaller, search left side
#         elif target < arr[mid]:
#             end = mid - 1

#         # If target is bigger, search right side
#         else:
#             start = mid + 1

#     return ans



# #___________________________________________________________________________________________________________


# Function to find last occurrence
# def last_occurrence(arr, target):

#     # Starting index
#     start = 0

#     # Ending index
#     end = len(arr) - 1

#     # Store answer
#     ans = -1

#     # Binary search loop
#     while start <= end:

#         # Find middle index
#         mid = start + (end - start) // 2

#         # If target found
#         if arr[mid] == target:

#             # Store current index as answer
#             ans = mid

#             # Move right to find last occurrence
#             start = mid + 1

#         # If target is smaller, search left side
#         elif target < arr[mid]:
#             end = mid - 1

#         # If target is bigger, search right side
#         else:
#             start = mid + 1

#     return ans

# #_____________________________________________________________________________________________________________



# # Main program

# arr = [1, 2, 2, 2, 3, 4, 5]

# target = 2


# # Calling functions
# first = first_occurrence(arr, target)
# last = last_occurrence(arr, target)


# # Printing result
# print("First occurrence:", first)
# print("Last occurrence:", last)


# # Function to merge two sorted arrays
# def merge(arr, left, mid, right):

#     # Create temporary arrays
#     left_arr = arr[left:mid + 1]
#     right_arr = arr[mid + 1:right + 1]


#     # Pointers for left array, right array and main array
#     i = 0
#     j = 0
#     k = left


#     # Compare elements of both arrays and insert smaller element
#     while i < len(left_arr) and j < len(right_arr):

#         if left_arr[i] <= right_arr[j]:

#             arr[k] = left_arr[i]
#             i += 1

#         else:

#             arr[k] = right_arr[j]
#             j += 1

#         k += 1


#     # Copy remaining elements of left array
#     while i < len(left_arr):

#         arr[k] = left_arr[i]
#         i += 1
#         k += 1


#     # Copy remaining elements of right array
#     while j < len(right_arr):

#         arr[k] = right_arr[j]
#         j += 1
#         k += 1

# #--------------------------------------------------------------------------------------------------------------


# # Function for merge sort implementation
# def merge_sort(arr, left, right):

#     # Base condition
#     # If only one element remains, it is already sorted
#     if left < right:

#         # Find middle index
#         mid = left + (right - left) // 2


#         # Sort left half
#         merge_sort(arr, left, mid)


#         # Sort right half
#         merge_sort(arr, mid + 1, right)


#         # Merge both sorted halves
#         merge(arr, left, mid, right)



# # Main program

# arr = [38, 27, 43, 3, 9, 82, 10]


# print("Before sorting:", arr)


# # Calling merge sort
# merge_sort(arr, 0, len(arr) - 1)


# print("After sorting:", arr)



# #--------------------------------------------------------------------------------------------------------------


# # rotated and sorted array
# def search(nums, target):

#     # Starting index
#     start = 0

#     # Ending index
#     end = len(nums) - 1


#     # Binary search
#     while start <= end:

#         # Find middle index
#         mid = start + (end - start) // 2


#         # If target found
#         if nums[mid] == target:
#             return mid


#         # Check if left half is sorted
#         if nums[start] <= nums[mid]:


#             # Check if target lies in left sorted part
#             if nums[start] <= target < nums[mid]:

#                 # Search left side
#                 end = mid - 1

#             else:

#                 # Search right side
#                 start = mid + 1


#         # Otherwise right half is sorted
#         else:


#             # Check if target lies in right sorted part
#             if nums[mid] < target <= nums[end]:

#                 # Search right side
#                 start = mid + 1

#             else:

#                 # Search left side
#                 end = mid - 1


#     # Target not found
#     return -1



# # Main program

# nums = [4,5,6,7,0,1,2]

# target = 0


# result = search(nums, target)


# print("Index:", result)
# #--------------------------------------------------------------------------------------------------------------



# # missing number in array
# # Function to find missing number
# def find_missing(arr):

#     # Total numbers should be from 1 to n
#     n = len(arr) + 1


#     # Calculate sum of numbers from 1 to n
#     total_sum = n * (n + 1) // 2


#     # Calculate sum of given array
#     arr_sum = 0

#     for i in arr:
#         arr_sum += i


#     # Difference gives missing number
#     missing = total_sum - arr_sum


#     return missing



# # Main program

# arr = [1, 2, 4, 5, 6]


# result = find_missing(arr)


# print("Missing number:", result)

# #--------------------------------------------------------------------------------------------------------------


# # to check sorted array
# # Function to check sorted and rotated array
# def check(nums):

#     # Count how many times order breaks
#     count = 0

#     n = len(nums)


#     # Traverse the array
#     for i in range(n):

#         # Compare current element with next element
#         # Use % n to compare last element with first element
#         if nums[i] > nums[(i + 1) % n]:

#             # Increase break count
#             count += 1


#     # For sorted rotated array, break should be only once
#     if count <= 1:
#         return True

#     else:
#         return False



# # Main program

# arr = [3, 4, 5, 1, 2]


# result = check(arr)


# print(result)
