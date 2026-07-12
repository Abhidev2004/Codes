n = int(input())
arr=list(map(int,input().split()))

min=arr[0]

for i in range(1,n):
    if arr[i]<min:
        min=arr[i]
print(min)