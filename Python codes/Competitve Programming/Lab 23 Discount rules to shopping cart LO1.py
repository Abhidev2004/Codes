n= int(input())

cart =[]

for _ in range(n):
    name,price = input().split()
    cart.append((name,int(price)))

d=int(input())

discount={}
for _ in range(d):
    name , percent= input().split()
    discount[name]= int(percent)

total =0

for name, price in cart:
    if name in discount:
        price = price -(price*discount[name]//100)
    print(name,price)
    total += price

print("Total Price=",total)