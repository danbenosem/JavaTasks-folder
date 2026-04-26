import random 



random1 = random.randrange(2)

name=""

if random1==0:
    name +="head"
  
if random1==1:

    name += "tail"



  
number = int(input("Enter 0 for head and 1 for tail:"))

if random1==number:
    print( f" it is {name},The guess is correct")

else:

    print(f"it is {name},The guess is not correct")



    









