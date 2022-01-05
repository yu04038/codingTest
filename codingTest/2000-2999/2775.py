import math

number = int(input())

for i in range(number):
    floor = int(input())
    room = int(input())

    first = floor + room
    second = room - 1

    total = math.factorial(first) / math.factorial(first-second) / math.factorial(second)
    print(int(total))