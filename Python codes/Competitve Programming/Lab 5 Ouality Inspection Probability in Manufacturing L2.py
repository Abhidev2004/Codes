def combination(n,k):
    if k>n:
        return 0
    k = min(k,n-k)
    result = 1
    for i in range(1, k+1):
        result = result * (n-i+1) //i
    return result

N,D,K,R = map(int,input().split())
favourable= combination(D,R) * combination(N-D,K-R)
total = combination(N,K)

probability = favourable/total
print(f"{probability:.6f}")