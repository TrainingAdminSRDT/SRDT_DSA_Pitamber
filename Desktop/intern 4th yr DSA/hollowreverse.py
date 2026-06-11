n=5
for i in range(n):
    for j in range(n):
        if i==0 or j==n-i-1 or j==i:
            print("*",end=" ")
        else:
            print(" ",end=" ")
    print()