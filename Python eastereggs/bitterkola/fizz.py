print("Enter the integer :")
num1 = int(input())

if num1 % 5 == 0:
    print("buzz", end="")
elif num1 % 3 == 0:
    print(" fizz", end="")
elif (num1 % 5 == 0 and num1 % 3 == 0) or (num1 % 5 != 0 and num1 % 3 != 0):
    print("FizzBuzz", end="")
