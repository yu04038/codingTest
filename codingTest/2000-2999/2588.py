first_number = int(input())
second_number = int(input())

second_number_one = int(second_number % 10)
second_number_ten = int((second_number / 10) % 10)
second_number_hun = int(second_number / 100)

first_output = first_number * second_number_one
second_output = first_number * second_number_ten
third_output = first_number * second_number_hun

print(first_output)
print(second_output)
print(third_output)
print(first_number * second_number)