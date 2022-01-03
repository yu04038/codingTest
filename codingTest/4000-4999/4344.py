test_num = int(input())

for i in range(test_num):
    sum = 0
    count = 0
    percentage = 0
    mean = 0
    grade = list(map(int, input().split()))
    for j in range(1, len(grade)):
        sum += grade[j]
    mean = sum / grade[0]
    for k in range(1, len(grade)):
        if (grade[k] > mean):
            count += 1
    percentage = count * 100 / grade[0]

    print("{:.3f}%".format(percentage))