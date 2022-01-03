def kaprekar():
    constructor = [0 for i in range(100000)]
    for n in range(1, 10001):
        if 1 <= n < 10:
            d = 2 * n
            constructor[d] = 1
        elif 10 <= n < 100:
            d = n + n // 10 + n % 10
            constructor[d] = 1
        elif 101 <= n < 1000:
            d = n + (n // 100) + ((n % 100) // 10) + (n % 10)
            constructor[d] = 1
        elif 1000 <= n < 10000:
            d = n + (n // 1000) + ((n % 1000) // 100) + (((n % 1000) % 100) // 10) + (n % 10)
            constructor[d] = 1

    for i in range(1, 10000):
        if constructor[i] == 0:
            print(i)

kaprekar()
