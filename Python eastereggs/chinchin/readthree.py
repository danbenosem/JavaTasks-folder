
number = input("Enter a three digit interger")
    
digit1 = number/100
digit2 = (number % 100)/10
digit3= (number%100)%10

if digit1 == 0 and digit2 == 0 and digit3 != 0:

   print("It is 1 digit integer")


if digit1 != 0 and digit2 ==0 and digit3 == 0:

    print("It is 3 digit integer")

if digit1 == 0 and digit2 !=0 and digit3 == 0:

   print("It is 2 digit integer")


  

    
