amount = int(input("Enter the purchase amount: "))

if amount<1000:
    total_amount=amount
elif(amount >=1000 and amount <=5000):
    total_amount= amount-(amount*0.10)
elif(amount >=5000 and amount <10000):
    total_amount= amount-(amount*0.20)
else:
    total_amount= amount-(amount*0.25) -500

print("The discounted price is", total_amount)