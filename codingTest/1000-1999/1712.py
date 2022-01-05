import math

fix, change, sell = map(int, input().split())

a = sell - change
b = fix

if (a == 0):
    print("-1")
else:
    x = math.floor(b / a)
    if (x < 0):
        print("-1")
    else:
        print(x + 1)



