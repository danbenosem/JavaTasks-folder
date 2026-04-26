print("Enter a price", end="")
num1 = float(input())

print("Enter a discount", end="")
num2 = float(input())

disAmount = num1 * (num2 / 100)
price = num1 - disAmount

print(f"final price:{price:f}", end="")
