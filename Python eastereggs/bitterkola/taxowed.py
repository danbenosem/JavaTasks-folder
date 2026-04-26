
print("Enter the annual tax", end="")
tax1 = float(input())

if tax1 > 300000 and tax1 <= 600000:
    tax1 = tax1 * 0.15
elif tax1 > 600000:
    tax1 = tax1 * 0.25

print(tax1, end="")
