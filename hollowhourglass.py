n=5
for i in range(n):
    print(" "*i+"*"+" "*(2*(n-i)-3)+"*")
for i in range(n-2,-1,-1):
    print(" "*i+"*"+" "*(2*(n-i)-3)+"*")