string = input()

list = [-1 for i in range(26)]
# a의 아스키 코드 : 97

for j in range(len(string)):
    if (list[ord(string[j]) - 97] == -1):
        list[ord(string[j]) - 97] = j
    
for i in range (len(list)):
    print(list[i], end = ' ')