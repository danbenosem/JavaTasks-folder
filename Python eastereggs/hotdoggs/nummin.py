

       
   
number = int(input("Enter the Time in minutes:"))
    # 525,600 minutes makes a year , a year is 365 days ,a day is 1440minutes

year = number//525600




if year>1:
  leftover_minutes= number-(year*525600)


else:
  leftover_minutes= number - (year*525600);

days= leftover_minutes//1440

      
    



    
print(f"The answers are  {year}, {days}" )
    




    







