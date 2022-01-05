import math
day, night, height = map(int, input().split())

temp = height - day
move = day - night
n = math.ceil(temp/move)

print(n + 1)