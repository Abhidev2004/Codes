a,b,p,k = map(int,input().split())
mod_prod = (a % p * b % p)%p

if mod_prod % k == 0:
    print("Divisible")
else:
    print("Not Divisible")