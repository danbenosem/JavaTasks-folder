print("Enter the time in mins:", end="")
time = int(input())

days = time // 1440
hours = (time % 1440) // 60
remain_mins = (time % 1440) % 60

print(f"{days} days, {hours} hours, {remain_mins}", end="")
