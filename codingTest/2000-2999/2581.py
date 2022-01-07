start = int(input())
final = int(input())

sosu = []
sum = 0

for i in range(start, final+1):
    list = []
    for j in range(1, i):
        if (i % j == 0):
            list.append(j)
    if len(list) == 1:
        sosu.append(i)
        sum += i
        
if len(sosu) == 0:
    print("-1")
else:
    print(sum)
    print(sosu[0])