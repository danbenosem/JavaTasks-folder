print("Enter the first   integer :")
num1 = int(input())

print("Enter the second intger :")
num2 = int(input())

sum_val = num1 + num2
product = num1 * num2
diff = num1 - num2

if num1 >= 0 and num2 >= 0:
    print(f" The sum  is {sum_val} ")
elif num1 < 0 and num2 < 0:
    print(f" The sum  is {product} ")
elif (num1 < 0 and num2 > 0) or (num1 > 0 and num2 < 0):
    print(f" The sum  is {diff} ")
