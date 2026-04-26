import math
   
num1= int(input("Enter the value of x1 :"))
    
 
num2= int(input("Enter the value of y1:"))

    
num3= int(input("Enter the value of x2 :"))

  
num4=int(input("Enter the value of y2 :"))

distance = (math.pow(math.pow((num3-num1),2),0.5) +  math.pow((num4-num2),2))/ math.pow(math.pow((num3-num1),2) +  math.pow((num4-num2),2),0.5)


      
    
print(f" The distance  is {distance}")

    





   
