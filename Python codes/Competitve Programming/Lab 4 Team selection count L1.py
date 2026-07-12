def combination(n,k):
    if k>n:
        return 0
    result =1
    k = min(k, n-k)
    for i in range(1,k+1):
        result = result*(n-i+1)// i
    return result
n,k= map(int,input().split())
print(combination(n,k))
