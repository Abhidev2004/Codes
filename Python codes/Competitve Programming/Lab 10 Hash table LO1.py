n = int(input())
table = set()

for _ in range(n):
    table.add(input().strip())

q = int(input())
for _ in range(q):
    s = input().strip()
    if s in table:
        print("Found")
    else:
        print("Not Found")
