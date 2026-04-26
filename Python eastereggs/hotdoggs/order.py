num1 = int(input("Enter the First integer: "))
num2 = int(input("Enter the second integer: "))
num3 = int(input("Enter the third integer: "))

if num1 >= num3 and num2 >= num3:
    if num1 >= num2:
        print(f"The order is {num3} {num2} {num1}")
    else:
        print(f"The order is {num3} {num1} {num2}")

elif num1 >= num2 and num3 >= num2:
    if num1 >= num3:
        print(f"The order is {num2} {num3} {num1}")
    else:
        print(f"The order is {num2} {num1} {num3}")

elif num2 >= num3 and num1 >= num3:
    if num2 >= num1:
        print(f"The order is {num3} {num1} {num2}")
    else:
        print(f"The order is {num3} {num2} {num1}")

elif num2 >= num1 and num3 >= num1:
    if num2 >= num3:
        print(f"The order is {num1} {num3} {num2}")
    else:
        print(f"The order is {num1} {num2} {num3}")

elif num3 >= num1 and num2 >= num1:
    if num3 > num2:
        print(f"The order is {num1} {num2} {num3}")
    else:
        print(f"The order is {num1} {num3} {num2}")

elif num3 > num2 and num1 > num2:
    if num3 >= num1:
        print(f"The order is {num2} {num1} {num3}")
    else:
        
        print(f"The order is {num2} {num3} {num1}")

else:
    print("that is strange")
