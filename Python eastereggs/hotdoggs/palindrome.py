input ("Enter the palindrome integer")
palin= int(input ("Enter the palindrome integer"))
digit1 = palin /100
digit2= (palin%100) / 10
digit3 = (palin%100) % 10 

if digit1 == digit3:
 
    print("It is a palindrome Integer")


else:

     print("It is not a palindrome Integer")

