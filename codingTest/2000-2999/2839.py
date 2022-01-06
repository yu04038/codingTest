kilo = int(input())

three = 0

while (kilo - 3 * three > 0):
    five_remainder = (kilo - 3 * three) % 5
    five_quotient = (kilo -3 * three) // 5
    if (five_remainder == 0):
        break
    else:
        three += 1
if (3 * three + 5 * five_quotient != kilo):
    print("-1")
else:
    print(three + five_quotient)