arr = [1, 2, 2, 3, 3, 2, 1, 4]

r = []
for x in arr:
    if x not in r:
        r.append(x)

print(r)