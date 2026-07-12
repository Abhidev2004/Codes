n,m = map(int,input().split())
arr= list(map(int,input().split()))

total = 0
for num in arr:
     total = ((total%m) +(num%m))%m
print(total)