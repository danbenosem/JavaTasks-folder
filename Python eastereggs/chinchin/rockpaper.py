import random

random1 = random.randrange(3)
name=""

if random1==0:
    name +="Rock"
  

elif random1==1:

    name += "paper"

elif random1==2:

    name += "Scissors"





  
number = int(input("Enter 0 for Rock ,1 for Paper, 2 for Scissors:"))



if random1==number:
    print(f" it is {name} ,it is a draw ")

elif number==1 and random1==0:

     print(f" it is {name} ,it is a win")


elif number==2 and random1==1:

 print(f" it is {name} ,it is a win ")


elif number==0 and random1==2:

    print(f"it is {name} ,you win")


else:

    print(f"it is {name} ,you lose")



  
  
  
    









