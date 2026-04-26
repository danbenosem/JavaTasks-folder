print("Enter the month in terms of integers:", end="")
month = int(input())

print("Enter the year:", end="")
year = int(input())


if (year % 4 == 0 and year % 100 != 0) or year % 400 == 0:
    
    if month == 2:
    
        print("It has 29 days")




else:
                     
                    if month == 1:
                    
                        print("It has 31 days")

                    elif month == 2:
    
                        print("It has 28 days")

                    elif month == 3:
    
                        print("It has 31 days")

                    elif month == 4:
    
                        print("It has 30 days")

                    elif month == 5:
    
                        print("It has 31 days")

                    elif month == 6:
    
                        print("It has 30 days")

                    elif month == 7:
    
                        print("It has 31 days")

                    elif month == 8:
    
                        print("It has 31 days")

                    elif month == 9:
    
                        print("It has 30 days")

                    elif month == 10:
    
                        print("It has 31 days")

                    elif month == 11:
    
                        print("It has 30 days")

                    elif month == 12:
    
                        print("It has 31 days")
