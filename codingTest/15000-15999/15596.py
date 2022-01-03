def solve(a):
    sum = 0
    for i in range(len(a)):
        sum += a[i]
    return sum

print(solve([1,2,3,4,5]))