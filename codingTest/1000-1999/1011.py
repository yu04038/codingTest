number = int(input())

for i in range(number):
    count = 0
    num = 1
    x, y = map(int, input().split())

    if (x != 0):
        y = y - x
        x = 0
    
    distance = y

    while True :
        if num**2 <= distance < (num+1)**2 :
            break
        else:
            num += 1
    if num**2 == distance :
        print((num*2)-1)
    elif num**2 < distance <= num**2 + num :
        print(num*2)
    else :
        print((num*2)+1)