print("Enter a 4 digit interger", end="")
number = int(input())

digit1 = number // 1000
digit2 = (number % 1000) // 100
digit3 = ((number % 1000) % 100) // 10
digit4 = ((number % 1000) % 100) % 10

if digit1 == 0:
    print("Invalid pin", end="")
else:
    print("Valid pin", end="")
