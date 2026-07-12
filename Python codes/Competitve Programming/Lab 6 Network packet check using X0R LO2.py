n = int(input())
arr = list(map(int, input().split()))
checksum = int(input())

xor_val= 0
for x in arr:
    xor_val = xor_val^x

if xor_val == checksum:
    print("OK")
else:
    print("ANOMALY")
