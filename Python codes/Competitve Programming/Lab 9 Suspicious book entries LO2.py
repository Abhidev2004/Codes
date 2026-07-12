n = int(input())
arr = list(map(int, input().split()))
x, k = map(int, input().split())

found = False
for i in range(n):
    if arr[i] == x:
        found = True
        if i < k:
            print("Valid Access")
        else:
            print("Late Access")
        break

if not found:
    print("Access ID Not Found")
