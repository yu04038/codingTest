string = input()

if "c=" in string:
    string = string.replace("c=", "1")

if "c-" in string:
    string = string.replace("c-", "2")

if "dz=" in string:
    string = string.replace("dz=", "3")
    
if "d-" in string:
    string = string.replace("d-", "4")

if 'lj' in string:
    string = string.replace('lj', '5')

if "nj" in string:
    string = string.replace("nj", "6")

if "s=" in string:
    string = string.replace("s=", "7")

if "z=" in string:
    string = string.replace("z=", "8")

print(len(string))