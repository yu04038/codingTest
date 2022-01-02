A = int(input())
B = int(input())
C = int(input())

multiple_abc = str(A * B * C)

for i in range(0, 10):
    print(multiple_abc.count(str(i)))