import math
   
num1= int( input("Enter the value of side 1:"))
    
num2= int( input("Enter the value of side 2:"))
num3= int( input("Enter the value of side 3:"))

sideo = (num1 +num2 +num3)/2
area= math.pow((sideo*(sideo-num1)*(sideo-num2)*(sideo-num3)),0.5)







print(f" The area is {area}")

      
    


