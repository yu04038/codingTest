number = int(input())
i = 2

while number > 1:
    
    if number % i == 0:
        print(i)
        number = number / i
    else:
        i += 1
