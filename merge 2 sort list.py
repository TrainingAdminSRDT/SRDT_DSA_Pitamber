# Topic: Merge Two Sorted Lists (User Input)

list1 = list(map(int, input("Enter first sorted list: ").split()))
list2 = list(map(int, input("Enter second sorted list: ").split()))

i = j = 0
merged = []

while i < len(list1) and j < len(list2):
    if list1[i] < list2[j]:
        merged.append(list1[i])
        i += 1
    else:
        merged.append(list2[j])
        j += 1

while i < len(list1):
    merged.append(list1[i])
    i += 1

while j < len(list2):
    merged.append(list2[j])
    j += 1

print("Merged List:", merged)