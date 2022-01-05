number = int(input())
first = 1
first_list = []
count = 1
while number >= first:
    first_list.append(first)
    first += count
    count += 1

if count % 2 == 1:
    print("{}/{}".format(number - first_list[-1] + 1, count - number + first_list[-1] -1))
else:
    print("{}/{}".format(count - number + first_list[-1] -1, number - first_list[-1] + 1))

