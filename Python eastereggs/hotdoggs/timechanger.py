


time = int(input("Enter the time in seconds: "))

digit1 = time/3600
digit2= (time%3600)/60
digit3 = (time%3600) % 60 


print(f "%{time}seconds = {digit1} hour, {digit2} minutes, {digit3} seconds ")






