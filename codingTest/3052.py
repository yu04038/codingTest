remainders = []
for i in range(10):
    number = int(input())
    remainder = number % 42
    remainders.append(remainder)

print(len(set(remainders)))