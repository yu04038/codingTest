sosu = [True] *246913
n = 1

for i in range(2, int(246913**0.5)+1):
    if sosu[i]:
        for j in range(2*i, 246913, i):
            sosu[j] = False

def prime_cnt(val):
    cnt = 0
    for i in range(val + 1, val * 2 + 1):
        if sosu[i]:
            cnt += 1
    print(cnt)

while True:
    val = int(input())
    if val == 0:
        break
    prime_cnt(val)