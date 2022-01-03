N = int(input())
number = int(input())

number_to_string = str(number)
sum = 0

for i in range(len(number_to_string)):
    number_to_int = int(number_to_string[i])
    sum += number_to_int

print(sum)