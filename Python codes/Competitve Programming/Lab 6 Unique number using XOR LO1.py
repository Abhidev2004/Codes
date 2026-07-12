n= int(input())
arr = list(map(int, input().split()))

ans = 0
for x in arr:
    ans = ans ^x
print(ans)