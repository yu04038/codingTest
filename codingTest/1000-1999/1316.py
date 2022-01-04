number = int(input())

count = 0
for i in range(number):
    string = input()
    not_duplicate = []
    not_duplicate.append(string[0])
    for j in range(len(string) - 1):
        if string[j] != string[j+1]:
            not_duplicate.append(string[j+1])
    
    if len(not_duplicate) == len(set(string)):
        count += 1

print(count)