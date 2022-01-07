sosu = []
check = [False, False] + [True] * 10000
for i in range(2, 101):
    if check[i] == True:
        for j in range(i + i, 10001, i):
            check[j] = False

T = int(input())
for _ in range(T):
    n = int(input())

    A = n // 2
    B = A
    for _ in range(10000):
        if check[A] and check[B]:
            print(A, B)
            break
        A -= 1
        B += 1
        
# for k in range(number):
#     n = int(input())
#     new_newList = []

#     newList = [l for l in sosu if l < n]
#     for m in newList:
#         if n - m in newList:
#             if m <= n-m:
#                 new_newList.append([m, n-m])
#     print("{} {}".format(new_newList[-1][0], new_newList[-1][1]))