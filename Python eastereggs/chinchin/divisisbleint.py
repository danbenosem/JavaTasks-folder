
 num1 = input("Enter an Integer:")


if num1 % 4 ==0  and num1 % 5==0:
    
    print("It is divisible by both 4 and 5")


if num1 % 4 == 0 or num1 % 5 == 0:
    
    print("It is divisible by 4 or 5")


if (   (num1 % 4  == 0  and num1 % 5 != 0) or (num1 % 4  != 0 and num1 % 5 == 0) ):
    
    print("It is divisible by both 4 or 5 but not both")



