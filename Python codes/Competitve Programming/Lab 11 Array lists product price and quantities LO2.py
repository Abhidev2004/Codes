n =int(input())
prices=list(map(int,input().split()))
quantity=list(map(int,input().split()))

total =0
for i in range(n):
    total = total +(prices[i]*quantity[i])
print(total)