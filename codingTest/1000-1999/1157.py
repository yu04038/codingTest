word = input()

count_dict = {}
word_to_upper = word.upper()
value = 0

for i in word_to_upper:
    if i not in count_dict:
        count_dict[i] = 1
    else:
        count_dict[i] += 1

new_list = list(count_dict.values())

if new_list.count(max(new_list)) > 1:
    print("?")
else:
    print(list(count_dict.keys())[new_list.index(max(new_list))])