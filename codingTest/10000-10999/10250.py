number = int(input())

for i in range(number):
    height, width, order = map(int, input().split())

    X = order // height
    Y = order % height

    if (Y == 0):
        Y = height
    else:
        X = X + 1

    room = Y * 100 + X
    print(room)