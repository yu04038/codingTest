sub_num = int(input())
total = 0

sub_grade = list(map(int, input().split()))
sub_new_grade = []
M = max(sub_grade)

for i in range(len(sub_grade)):
    new_grade = sub_grade[i] * 100 / M
    total += new_grade
    
print(total / sub_num)




