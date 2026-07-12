def find(parent, x):
    while parent[x] != x:
        x = parent[x]
    return x


def union(parent, a, b):
    rootA = find(parent, a)
    rootB = find(parent, b)

    if rootA != rootB:
        parent[rootB] = rootA


n = int(input())
m = int(input())

parent = list(range(n + 1))

for _ in range(m):
    op = input().split()

    if op[0] == "union":
        a = int(op[1])
        b = int(op[2])
        union(parent, a, b)

    elif op[0] == "find":
        x = int(op[1])
        print(find(parent, x))
