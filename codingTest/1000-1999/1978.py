number = int(input())

data = list(map(int, input().split()))
sum = 0

for i in data:
    count = []
    if (i != 1):
        for j in range(1, i):
            if i % j == 0:
                count.append("0")

        if len(count) == 1:
            sum += 1
                
print(sum)
