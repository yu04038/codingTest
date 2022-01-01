number = int(input())
number_list = []
number_list.append(number)

while (number_list[0] != number_list[-1] or len(number_list) == 1):
    if (number < 10):
        number = number * 10
        number_first = int(number / 10)
        number_second = int(number % 10)
        number = number + number_first
        number_list.append(number)
        
    else:
        number_first = int(number / 10)
        number_second = int(number % 10)
        number = number_second * 10 + (number_first + number_second) % 10
        number_list.append(number)

print(len(number_list) - 1)