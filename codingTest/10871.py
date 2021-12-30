import sys

n, x = map(int, sys.stdin.readline().split())

number_list = list(map(int, input().split()))

for j in range(len(number_list)):
    if (x > number_list[j]):
        print(number_list[j], end=" ")


