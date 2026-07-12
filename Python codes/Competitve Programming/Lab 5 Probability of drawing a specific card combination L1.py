def combination(n,k):
    if k>n:
        return 0
    k = min(k,n-k)
    result =1
    for i in range(1,k+1):
        result =  result *(n-i+1) // i
    return result

k,r = map(int,input().split())
favourable = combination(13,r) * combination(39,k-r)
total = combination(52,k)

probability = favourable/total
print(f"{probability:.6f}")