print("Enter the time in hours:", end="")
hours = int(input())


print("Enter the time in mins:", end="")


mins = int(input())

print("Enter the time in hours:", end="")


hours1 = int(input())

print("Enter the time in mins:", end="")
mins1 = int(input())

time1 = 0
time2 = 0
time3 = 0
time4 = 0

if hours > 23:
    time1 = 24 - hours
else:
    time1 = hours

if mins > 59:



    time2 = mins % 60
else:
    time2 = mins

if hours1 > 23:



    time3 = 24 - hours1
else:
    time3 = hours1




if mins1 > 59:
    time4 = mins1 % 60



else:
    time4 = mins1

print(f"{time1}:{time2}")



print(f"{time3}:{time4}", end="")

totalHours = time1 + time3


totalMins = time2 + time4
totalmins1 = 0

if totalMins > 59:


    totalmins1 = totalMins // 60
    totalMins = totalMins % 60

totalHours1 = totalHours + totalmins1
print(f"\nthe total time is {totalHours1} hours {totalMins} minute(s)", end="")
