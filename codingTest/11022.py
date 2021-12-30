import sys

T = int(input())
sum = []
a_list = []
b_list = []

for i in range(T):
    a, b = map(int, sys.stdin.readline().split())
    sum.append(a+b)
    a_list.append(a)
    b_list.append(b)

for j in range(T):
    print("Case #{}: {} + {} = {}".format(j + 1, a_list[j], b_list[j], sum[j]))