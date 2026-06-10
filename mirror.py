n=4
for i in range(n):
    print(" "*i,end="")
    for j in range(i+1,n+1):
        print(j,end=" ")
    print()
for i in range(n-2,-1,-1):
    print(" "*i,end="")
    for j in range(i+1,n+1):
        print(j,end=" ")
    print()