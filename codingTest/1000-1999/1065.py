def hansu(number):
    list = [0 for i in range(number+1)]
    for i in range(1, number+1):
        if 1 <= i < 100:
            list[i] = 1
        elif 100 <= i < 1000:
            hundred = i // 100
            ten = (i % 100) // 10
            one = i % 10
            
            if (ten * 2 == hundred + one):
                list[i] = 1
    
    print(list.count(1))

num = int(input())
hansu(num)