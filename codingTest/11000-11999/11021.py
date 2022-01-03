import sys

T = int(input())
sum = []

for i in range(T):
    a, b = map(int, sys.stdin.readline().split())
    sum.append(a+b)

for j in range(T):
    print("Case #{}: {}".format(j + 1, sum[j]))