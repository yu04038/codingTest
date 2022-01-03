import math
test_num = int(input())
result = []
count = 0
sum = 0
for i in range(test_num):
    quiz_result = str(input())

    for j in range(len(quiz_result)):
        if (quiz_result[j] == "O"):
            count += 1
            sum += count
        if (quiz_result[j] == "X"):
            count = 0
    print(sum)
    sum = 0
    count = 0
