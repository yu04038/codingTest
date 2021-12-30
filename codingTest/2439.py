n = int(input())
star = ""
spaceBar = ""
for i in range(n, 0, -1):
    print(" " * (i-1) + "*" * (n-i+1))

