def factorial (n):
    fact =1
    for i in range(1,n+1):
        fact *=i
    return fact

N,K=map(int,input().split())

#Combination using factorial
result=factorial(N) // (factorial(K) * factorial(N-K))
print(result)


# def combination(n,k):
#     if k>n:
#         return 0
#     result =1
#     k = min(k, n-k)
#     for i in range(1,k+1):
#         result = result*(n-i+1)// i
#     return result
# n,k= map(int,input().split())
# print(combination(n,k))