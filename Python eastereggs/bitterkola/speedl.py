print("Enter the speed in km/hr:", end="")
speed = int(input())

if speed == 0:
    print("Stationary", end="")
elif speed > 0 and speed <= 40:
    print("slow", end="")
elif speed > 40 and speed <= 80:
    print("moderate", end="")
elif speed > 80 and speed <= 120:
    print("fast", end="")
elif speed > 120:
    print("Dangerously fast", end="")
