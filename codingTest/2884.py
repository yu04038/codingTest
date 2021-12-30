hour, minute = input().split()

hour = int(hour)
minute = int(minute)

if (minute >= 45):
    early_minute = minute - 45
    print(str(hour) + " " + str(early_minute))
else:
    early_minute = minute + 15
    if (hour != 0):
        early_hour = hour - 1
        print(str(early_hour) + " " + str(early_minute))
    else:
        early_hour = 23
        print(str(early_hour) + " " + str(early_minute))