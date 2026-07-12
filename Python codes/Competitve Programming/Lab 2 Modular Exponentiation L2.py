import time
def mod_exp(a,m,p):
    start_time = time.time()
    result =1
    a= a%p
    while m >0:
        if m % 2 == 1:
            result = (result * a ) % p
        a=(a*a) % p
        m= m //2
    return result
    end_time = time.time()
    print(end_time - start_time)

a,m,p= map(int,input().split())
print(mod_exp(a,m,p))