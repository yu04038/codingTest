T = int(input())
sum = []

for i in range(T):
    a, b = input().split()
    a = int(a)
    b = int(b)
    sum.append(a+b)

for j in range(T):
    print(sum[j])