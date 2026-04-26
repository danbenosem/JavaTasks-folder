import random




gen = random.range(90)+10


number = int(input("Enter a two digit Number:"))

genDigit1= gen /10
genDigit2= gen % 10

numDigit1= number /10
numDigit2= number % 10




if number == gen:

    print("You win $10,100")


if (    (numDigit1==genDigit1 or numDigit1 == genDigit2) and (numDigit2==genDigit1 or numDigit2 == genDigit2) :

        print("You win $3000")

if (    (numDigit1==genDigit1 or numDigit1 == genDigit2) or (numDigit2==genDigit1 or numDigit2 == genDigit2):

        print("You win $1000")


