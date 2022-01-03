number_9 = []
for i in range(9):
    number = int(input())
    number_9.append(number)

print(max(number_9))
print(number_9.index(max(number_9))+1)