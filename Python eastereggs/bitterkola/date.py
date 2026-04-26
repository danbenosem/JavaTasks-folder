print("Enter a three digit interger", end="")
digit1 = int(input())

print("Enter a three digit interger", end="")
digit2 = int(input())

print("Enter a three digit interger", end="")
digit3 = int(input())

if digit1 > 31:
    print("Invalid date", end="")
elif digit2 > 12:
    print("Invalid month", end="")
elif digit3 // 1000 < 0:
    print(" invalid year", end="")

print(f"{digit1}:{digit2}:{digit3}", end="")
