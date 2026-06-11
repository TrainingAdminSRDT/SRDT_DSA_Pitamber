n = int(input("Enter size: "))

for i in range(n):
	print(" " * i, end="")
	for j in range(n):
		print("*", end=" ")
	print()
