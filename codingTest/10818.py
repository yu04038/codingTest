number = int(input())

number_list = list(map(int, input().split()))

print("{} {}".format(min(number_list), max(number_list)))
