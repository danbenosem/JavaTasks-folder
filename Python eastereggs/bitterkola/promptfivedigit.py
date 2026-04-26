print("Enter a 4 digit interger", end="")
number = int(input())

digit1 = number // 10000
digit2 = (number % 10000) // 1000
digit3 = ((number % 10000) % 1000) // 100
digit4 = (((number % 10000) % 1000) % 100) // 10
digit5 = (((number % 10000) % 1000) % 100) % 10

formu = digit5 - digit1
print(formu, end="")
