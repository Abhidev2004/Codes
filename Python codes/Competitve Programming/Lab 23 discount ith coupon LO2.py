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

coupon,threshold=map(int,input().split())
total =0

for name, price in cart:
    if name in discount:
        price = price -(price*discount[name]//100)
    print(name,price)
    total += price

print("Price after discount",total)

if total>threshold:
 total =total-coupon

print("Final Cart Price=",total)