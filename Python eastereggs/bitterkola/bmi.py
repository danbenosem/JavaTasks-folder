print("Enter the weight :")
num1 = float(input())

print("Enter the height :")
num2 = float(input())

bmi = (num1) / (num2 * num2)

if bmi < 18.5:
    print("Underweight")
elif bmi >= 18.5 and bmi <= 24.9:
    print("NormalN")
elif bmi >= 25 and bmi <= 29.9:
    print("overweight")
elif bmi >= 30:
    print("obese")

print(f" The Bmi  is {bmi: } ", end="")
