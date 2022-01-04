first, second = map(str, input().split())

first_reverse = ""
second_reverse = ""

for i in range(2, -1, -1):
    first_reverse += first[i]
    second_reverse += second[i]

first_reverse = int(first_reverse)
second_reverse = int(second_reverse)

if (first_reverse > second_reverse):
    print(first_reverse)
else:
    print(second_reverse)