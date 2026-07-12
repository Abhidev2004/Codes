n = int(input())
arr= list(map(int, input().split()))

total =0

for i in range(n):
    total = total + arr[i]
    print(arr[i],end=" ")
print("Total Price",total)