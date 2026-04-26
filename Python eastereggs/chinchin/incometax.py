


print("Enter your filing status: 0 for single, 1 for married filing jointly, 2 for married filing separately, 3 for head of household")



filing = int(input("Enter filing: "))
tax = int(input("Enter taxable income: "))

if filing == 0:


    if tax > 0 and tax <= 8350:
        taxrate = tax * 0.1
        print(f"new income is {taxrate}")


    elif tax > 8350 and tax <= 33950:
        taxrate = tax * 0.15


        print(f"new income is {taxrate}")
    elif tax > 33950 and tax <= 82250:
        taxrate = tax * 0.25


        print(f"new income {taxrate}")
    elif tax > 82250 and tax <= 171550:
        taxrate = tax * 0.28
        print(f"new income  {taxrate}")


    elif tax > 171550 and tax <= 372950:
        taxrate = tax * 0.33


        print(f"new income is {taxrate}")
    elif tax > 372950:


        taxrate = tax * 0.35
        print(f"new income is {taxrate}")

elif filing == 1:
    if tax > 0 and tax <= 16700:
        taxrate = tax * 0.1
        print(f"new income is {taxrate}")
    elif tax > 16700 and tax <= 67900:
        taxrate = tax * 0.15


        print(f"new income is {taxrate}")
    elif tax > 67900 and tax <= 137050:
        taxrate = tax * 0.25


        print(f"new income is {taxrate}")
    elif tax > 137050 and tax <= 208850:
        taxrate = tax * 0.28


        print(f"new income is {taxrate}")
    elif tax > 208850 and tax <= 372950:
        taxrate = tax * 0.33


        print(f"new income is {taxrate}")
    elif tax > 372950:
        taxrate = tax * 0.35
        print(f"new income is {taxrate}")

elif filing == 2:
    if tax > 0 and tax <= 8350:
        taxrate = tax * 0.1
        print(f"new income is {taxrate}")

    elif tax > 8350 and tax <= 33950:
        taxrate = tax * 0.15


        print(f"new income is {taxrate}")
    elif tax > 33950 and tax <= 68525:
        taxrate = tax * 0.25


        print(f"new income is {taxrate}")
    elif tax > 68525 and tax <= 104525:

        taxrate = tax * 0.28
        print(f"new income is {taxrate}")

    elif tax > 104525 and tax <= 186475:
        taxrate = tax * 0.33

        print(f"new income is {taxrate}")
    elif tax > 186475:

        taxrate = tax * 0.35
        print(f"new income is {taxrate}")

elif filing == 3:

    if tax > 0 and tax <= 11950:
        taxrate = tax * 0.1
        print(f"new income is {taxrate}")

    elif tax > 11950 and tax <= 45500:
        taxrate = tax * 0.15
        print(f"new income is {taxrate}")

    elif tax > 45500 and tax <= 117450:

        taxrate = tax * 0.25
        print(f"new income is {taxrate}")

    elif tax > 117450 and tax <= 190200:

        taxrate = tax * 0.28
        print(f"new income is {taxrate}")

    elif tax > 190200 and tax <= 372950:

        taxrate = tax * 0.33
        print(f"new income is {taxrate}")


    elif tax > 372950:
        taxrate = tax * 0.35
        print(f"new income is {taxrate}")
