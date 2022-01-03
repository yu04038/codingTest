test_num = int(input())

for i in range(test_num):

    final_string = ''

    repeat, string = input().split()
    repeat = int(repeat)
    string = str(string)

    for i in range(len(string)):
        final_string += string[i] * repeat

    print(final_string)